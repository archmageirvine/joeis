package irvine.factor.gnfs;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.util.array.DynamicIntArray;

/**
 * Read and prepare a matrix for block Lanczos.
 * @author Kleinjung Thorsten
 * @author Sean A. Irvine
 */
final class LanczosReadMatrix {
  
  private LanczosReadMatrix() { }

  private static final int COLUMN_EXCESS = 214;

  private static int countNonZero(final int[] a, final int len) {
    int count = 0;
    for (int k = 0; k < len; ++k) {
      if (a[k] != 0) {
        ++count;
      }
    }
    return count;
  }

  private static int max(final int[] a, final int nCols) {
    int max = 0;
    for (int j = 0; j < nCols; ++j) {
      if (a[j] > max) {
        max = a[j];
      }
    }
    return max;
  }

  private static long sum(final int[] a, final int n) {
    long wt = 0;
    for (int k = 0; k < n; ++k) {
      wt += a[k];
    }
    return wt;
  }

  static Lanczos loadMatrix(final InputStream is, final DynamicIntArray rowWtDA, final DynamicIntArray colwtDA) throws IOException {
    int nonzeroCols = 0;
    int nonzeroRows = 0;
    try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(is))) {
      while (dis.available() > 0) {
        final int nonzero = Integer.reverseBytes(dis.readInt());
        if (nonzero == 0) {
          System.err.println("Trivial relation?");
        }
        for (int k = 0; k < nonzero; ++k) {
          final int v = Integer.reverseBytes(dis.readInt());
          rowWtDA.set(v, rowWtDA.get(v) + 1);
          if (v > nonzeroRows) {
            nonzeroRows = v;
          }
        }
        colwtDA.set(nonzeroCols++, nonzero);
      }
    }
    return new Lanczos(nonzeroCols, nonzeroRows + 1, System.out, true);
  }

  static Lanczos readReduceMatrix(final String matName, final PrintStream out) throws IOException {

    // Calculate row and column weights
    final DynamicIntArray rowWtDA = new DynamicIntArray();
    final DynamicIntArray colWtDA = new DynamicIntArray();
    final Lanczos m;
    try (final FileInputStream is = new FileInputStream(matName)) {
      m = loadMatrix(is, rowWtDA, colWtDA);
    }
    // Go from dynamics to ordinary arrays
    final int[] colWt = colWtDA.toArray();
    final int[] rowWt = rowWtDA.toArray();

    // Determine number of rows and columns
    final int rows = m.mNRows;
    final int cols = m.mNCols;
    int nonzeroCols = countNonZero(colWt, cols);
    int nonzeroRows = countNonZero(rowWt, rows);
    long wt = sum(rowWt, rows);
    out.println(nonzeroRows + " * " + nonzeroCols + ", wt=" + wt);
    final int nonzeroMax = IntegerUtils.max(colWt);

    // Delete (row) singletons and corresponding columns
    boolean change;
    do {
      change = false;
      int j = 0;
      final int[] tmp = new int[nonzeroMax];
      try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(matName)))) {
        while (dis.available() > 0) {
          final int nonzero = Integer.reverseBytes(dis.readInt());
          for (int i = 0; i < nonzero; ++i) {
            tmp[i] = Integer.reverseBytes(dis.readInt());
          }
          if (colWt[j] != 0) {
            for (int i = 0; i < nonzero; ++i) {
              if (rowWt[tmp[i]] == 1) {
                for (int k = 0; k < nonzero; ++k) {
                  final int v = tmp[k];
                  if (rowWt[v] != 0) {
                    --colWt[j];
                    --wt;
                    if (--rowWt[v] == 0) {
                      --nonzeroRows;
                    }
                  }
                }
                assert colWt[j] == 0;
                --nonzeroCols;
                change = true;
                break;
              }
            }
          }
          ++j;
        }
      }
    } while (change);
    out.println(nonzeroRows + " * " + nonzeroCols + ", wt=" + wt);

    // Delete excess columns
    final boolean[] delcols = new boolean[cols];
    int cwt = max(colWt, cols);
    int ex = nonzeroCols - nonzeroRows - COLUMN_EXCESS;
    if (ex > 0) {
      outer:
      while (ex > 0) {
        for (int j = 0; j < cols; ++j) {
          if (colWt[j] == cwt) {
            delcols[j] = true;
            if (--ex <= 0) {
              break outer;
            }
          }
        }
        if (--cwt == 0) {
          break;
        }
      }
      try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(matName)))) {
        int j = 0;
        while (dis.available() > 0) {
          final int anz = Integer.reverseBytes(dis.readInt());
          if (delcols[j]) {
            for (int i = 0; i < anz; ++i) {
              final int v = Integer.reverseBytes(dis.readInt());
              if (rowWt[v] != 0) {
                --colWt[j];
                --wt;
                if (--rowWt[v] == 0) {
                  --nonzeroRows;
                }
              }
            }
            assert colWt[j] == 0;
            --nonzeroCols;
          } else {
            // skip the entry
            for (int i = 0; i < anz; ++i) {
              dis.readInt();
            }
          }
          ++j;
        }
      }
    }
    out.println(nonzeroRows + " * " + nonzeroCols + ", wt=" + wt);

    // Delete row singletons and corresponding columns, same as above
    change = false;
    do {
      int j = 0;
      try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(matName)))) {
        final int[] tmp = new int[nonzeroMax];
        while (dis.available() > 0) {
          boolean one = false;
          final int anz = Integer.reverseBytes(dis.readInt());
          for (int i = 0; i < anz; ++i) {
            tmp[i] = Integer.reverseBytes(dis.readInt());
          }
          if (colWt[j] != 0) {
            for (int i = 0; i < anz; ++i) {
              if (rowWt[tmp[i]] == 1) {
                one = true;
                break;
              }
            }
            if (one) {
              for (int i = 0; i < anz; ++i) {
                final int v = tmp[i];
                if (rowWt[v] != 0) {
                  --wt;
                  --colWt[j];
                  if (--rowWt[v] == 0) {
                    --nonzeroRows;
                  }
                }
                assert colWt[j] == 0;
                --nonzeroCols;
                change = true;
              }
            }
            ++j;
          }
        }
      }
    } while (change);
    out.println(nonzeroRows + " * " + nonzeroCols + ", wt=" + wt);

    /*
      At this point Kleinjung has a whole block to delete excess
      rows. As near as I can tell it only happens when delanz
      is nonzero.  I've never used it so I'm skipping the block.
    */

    // sort rows, because of java scankiness need to use Integers here
    final Integer[] rowInd = new Integer[m.mNRows];
    for (int i = 0; i < m.mNRows; ++i) {
      rowInd[i] = i;
    }
    Arrays.sort(rowInd, (a, b) -> {
      final int aa = rowWt[a];
      final int bb = rowWt[b];
      return Integer.compare(bb, aa);
    });
    final int[] delRows = new int[m.mNRows];
    Arrays.fill(delRows, -1);
    for (int i = 0; i < nonzeroRows; ++i) {
      delRows[rowInd[i]] = i;
    }

    // Store weight-0 columns
    int nonzero = m.mNCols - countNonZero(colWt, m.mNCols);
    assert nonzero == m.mNCols - nonzeroCols;
    if (nonzero != 0) {
      m.mDeletedCols = new int[nonzero];
      for (int i = 0, j = 0; i < m.mNCols; ++i) {
        if (colWt[i] == 0) {
          m.mDeletedCols[j++] = i;
        }
      }
    } else {
      m.mDeletedCols = null;
    }

    // Determine number of entries in each block
    final int colBlocks = (nonzeroCols - 1) / Lanczos.BLOCKLEN + 1;
    final int rowBlocks = (nonzeroRows - 1) / Lanczos.BLOCKLEN + 1;
    out.println("Blocks: " + rowBlocks + " * " + colBlocks);
    final int[][] blocksize = new int[rowBlocks][colBlocks];
    int colnr = 0;
    try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(matName)))) {
      int j = 0;
      final int[] tmp = new int[nonzeroMax];
      while (dis.available() > 0) {
        nonzero = Integer.reverseBytes(dis.readInt());
        for (int i = 0; i < nonzero; ++i) {
          tmp[i] = dis.readInt();
        }
        if (colWt[j] != 0) {
          assert colnr < nonzeroCols;
          int ind = 0;
          for (int i = 0; i < nonzero; ++i) {
            final int v = Integer.reverseBytes(tmp[i]);
            if (delRows[v] != -1) {
              ++blocksize[delRows[v] / Lanczos.BLOCKLEN][colnr / Lanczos.BLOCKLEN];
              ++ind;
            }
          }
          assert ind == colWt[j];
          ++colnr;
        }
        ++j;
      }
    }
    assert colnr == nonzeroCols;

    // calculate size of matrix
    m.mEntries = new char[rowBlocks][][];
    for (int i = 0; i < m.mEntries.length; ++i) {
      m.mEntries[i] = new char[colBlocks][];
    }
    int statDenseAnz = 0;
    int statSparseAnz = 0;
    int statSparseEntries = 0;
    int statDenseEntries = 0;
    final int restCols = nonzeroCols - (colBlocks - 1) * Lanczos.BLOCKLEN;
    final int[] blockwidth = new int[colBlocks];
    Arrays.fill(blockwidth, 0, colBlocks - 1, Lanczos.BLOCKLEN);
    blockwidth[colBlocks - 1] = restCols;
    long size = 0;
    for (final int[] bs : blocksize) {
      for (int j = 0; j < colBlocks; ++j) {
        size += 2;
        final int bsj = bs[j];
        if (bsj >= blockwidth[j]) {
          ++statDenseAnz;
          statDenseEntries += bsj;
          size += bsj + blockwidth[j];
        } else {
          ++statSparseAnz;
          statSparseEntries += bsj;
          size += bsj << 1;
        }
      }
    }
    out.println("Dense: " + statDenseAnz + " (" + statDenseEntries + "), Sparse: " + statSparseAnz + " (" + statSparseEntries + ")");
    out.println("Matrix-Bytes: " + (size << 1));

    for (int i = 0; i < blocksize.length; ++i) {
      for (int j = 0; j < colBlocks; ++j) {
        final int bs = blocksize[i][j];
        final int bw = blockwidth[j];
        if (bs >= bw) {
          // dense
          m.mEntries[i][j] = new char[2 + bs + bw];
          m.mEntries[i][j][1] = (char) (j == colBlocks - 1 ? restCols : 0);
        } else {
          // sparse
          m.mEntries[i][j] = new char[2 + (2 * bs)];
          m.mEntries[i][j][0] = 1;
          m.mEntries[i][j][1] = (char) bs;
        }
      }
    }

    final int[] matptr = new int[rowBlocks];
    Arrays.fill(matptr, 2);

    final int[] colblanz = new int[rowBlocks];
    colnr = 0;

    // read matrix
    try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(matName)))) {
      int j = 0;
      int jj = 0;
      final int[] tmp = new int[nonzeroMax];
      while (dis.available() > 0) {
        nonzero = Integer.reverseBytes(dis.readInt());
        for (int i = 0; i < nonzero; ++i) {
          tmp[i] = Integer.reverseBytes(dis.readInt());
        }
        if (colWt[j] != 0) {
          Arrays.fill(colblanz, 0);
          for (int i = 0; i < nonzero; ++i) {
            final int v = tmp[i];
            if (delRows[v] != -1) {
              colblanz[delRows[v] / Lanczos.BLOCKLEN]++;
            }
          }
          for (int i = 0; i < blocksize.length; ++i) {
            if (blocksize[i][jj] >= blockwidth[jj]) {
              m.mEntries[i][jj][matptr[i]++] = (char) colblanz[i];
            }
          }
          for (int i = 0; i < nonzero; ++i) {
            final int v = tmp[i];
            if (delRows[v] != -1) {
              final int ii = delRows[v] / Lanczos.BLOCKLEN;
              if (blocksize[ii][jj] < blockwidth[jj]) {
                m.mEntries[ii][jj][matptr[ii]++] = (char) (colnr % Lanczos.BLOCKLEN);
              }
              m.mEntries[ii][jj][matptr[ii]++] = (char) (delRows[v] % Lanczos.BLOCKLEN);
            }
          }
          if (++colnr % Lanczos.BLOCKLEN == 0 && ++jj < colBlocks) {
            Arrays.fill(matptr, 2);
          }
        }
        ++j;
      }
    }
    assert colnr == nonzeroCols;
    m.mNCols = nonzeroCols;
    m.mNRows = nonzeroRows;
    m.mNColBlocks = colBlocks;
    out.println("reduced matrix: " + m.mNRows + " * " + m.mNCols);
    return m;
  }

}
