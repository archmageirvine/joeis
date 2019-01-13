package irvine.factor.gnfs;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Arrays;

import irvine.math.LongUtils;

/**
 * Block Lanczos matrix reduction.
 *
 * @author Kleinjung Thorsten
 * @author Sean A. Irvine
 */
public class Lanczos implements Serializable {

  private static final long serialVersionUID = -820875988119776532L;

  /** Blocking parameters. */
  static final int BLOCKBITS = 14;
  static final int BLOCKLEN = 1 << BLOCKBITS;

  private final boolean mCheckpointing;
  int mNCols;
  int mNRows;
  int mNColBlocks;
  char[][][] mEntries = null;
  int[] mDeletedCols = null;
  private transient PrintStream mOut;

  Lanczos(final int cols, final int rows, final PrintStream out, final boolean checkpointing) {
    mCheckpointing = checkpointing;
    mNCols = cols;
    mNRows = rows;
    mOut = out;
  }

  private long[] mV0;
  private long[] mV;
  private long[] mVo;
  private long[] mVoo;
  private long[] mX;
  private long[] mHv1;
  private long[] mHv2;
  private long[] mD;
  private long[] mE;
  private long[] mF;
  private long[] mW;
  private long[] mWo;
  private long[] mWoo;
  private long[] mVVV;
  private long[] mVVVo;
  private long[] mVTV;
  private long[] mVTVo;
  private long[] mVTVoo;
  private long[] mHm1;
  private long[] mHm2;
  private long[] mVAV;
  private long[] mVAVo;
  private long[] mVAAV;
  private long[] mHmul;

  void init() {
    mV0 = new long[mNCols];
    mV = new long[mNCols];
    mVo = new long[mNCols];
    mVoo = new long[mNCols];
    mX = new long[mNCols];
    mHv1 = new long[mNCols];
    mHv2 = new long[mNCols];
    mD = new long[64];
    mE = new long[64];
    mF = new long[64];
    mW = new long[64];
    mWo = new long[64];
    mWoo = new long[64];
    mVVV = new long[64];
    mVVVo = new long[64];
    mVTV = new long[64];
    mVTVo = new long[64];
    mVTVoo = new long[64];
    mHm1 = new long[64];
    mHm2 = new long[64];
    mVAV = new long[64];
    mVAVo = new long[64];
    mVAAV = new long[64];
    mHmul = new long[mNRows];
  }

  private void multiplySparseMatrixVector(final long[] v1, final long[] v2) {
    Arrays.fill(mHmul, 0L);
    for (int jj = 0, vi = 0; jj < mNColBlocks; ++jj, vi += BLOCKLEN) {
      for (int ii = 0, hi = 0; ii < mEntries.length; ++ii, hi += BLOCKLEN) {
        final char[] mm = mEntries[ii][jj];
        int mmi = 0;
        if (mm[mmi++] != 0) {
          // sparse part
          final int anz = mm[mmi++];
          for (int k = 0; k < anz; ++k) {
            final int us = mm[mmi++];
            mHmul[hi + mm[mmi++]] ^= v1[vi + us];
          }
        } else {
          // dense part
          int imax = mm[mmi++];
          if (imax == 0) {
            imax = BLOCKLEN;
          }
          for (int k = 0; k < imax; ++k) {
            final long h = v1[vi + k];
            for (int anz = mm[mmi++]; anz > 0; --anz) {
              mHmul[hi + mm[mmi++]] ^= h;
            }
          }
        }
      }
    }

    Arrays.fill(v2, 0L);
    for (int jj = 0, vi = 0; jj < mNColBlocks; ++jj, vi += BLOCKLEN) {
      for (int ii = 0, hi = 0; ii < mEntries.length; ++ii, hi += BLOCKLEN) {
        final char[] mm = mEntries[ii][jj];
        int mmi = 0;
        if (mm[mmi++] != 0) {
          // sparse part
          final int anz = mm[mmi++];
          for (int i = 0; i < anz; ++i) {
            final int us = mm[mmi++];
            v2[vi + us] ^= mHmul[hi + mm[mmi++]];
          }
        } else {
          // dense part
          int imax = mm[mmi++];
          if (imax == 0) {
            imax = BLOCKLEN;
          }
          for (int i = 0; i < imax; ++i) {
            long h = 0L;
            for (int anz = mm[mmi++]; anz > 0; --anz) {
              h ^= mHmul[hi + mm[mmi++]];
            }
            v2[vi + i] ^= h;
          }
        }
      }
    }
  }

  // ULLMASK is like an identity matrix ULLMASK[0] = 1L << 63, ULLMASK[1] = 1L << 62, etc.
  // this is actually faster than doing the shift -- ? really?
  static final long[] ULLMASK = new long[64];
  static {
    long m = 1L;
    for (int k = 63; k >= 0; --k) {
      ULLMASK[k] = m;
      m <<= 1;
    }
  }

  private int findW() {
    final long[] helpmat = Arrays.copyOf(mVAV, 64);
    final long[] inv = Arrays.copyOf(ULLMASK, 64);
    final int[] order = new int[64];
    int anz = 0;
    for (int i = 0; i < 64; ++i) {
      if ((mS & ULLMASK[i]) == 0L) {
        order[anz++] = i;
      }
    }
    for (int i = 0; i < 64; ++i) {
      if ((mS & ULLMASK[i]) != 0L) {
        order[anz++] = i;
      }
    }
    assert anz == 64;
    mS = 0L;
    int indep = 0;
    for (int k = 0; k < 64; ++k) {
      final int a = order[k];
      final long ma = ULLMASK[a];
      for (int j = k; j < 64; ++j) {
        if ((helpmat[a] & ma) != 0L) {
          break;
        }
        final int b = order[j];
        if ((helpmat[b] & ma) != 0L) {
          long h = helpmat[b];
          helpmat[b] = helpmat[a];
          helpmat[a] = h;
          h = inv[b];
          inv[b] = inv[a];
          inv[a] = h;
        }
      }
      if ((helpmat[a] & ma) != 0L) {
        mS ^= ma;
        ++indep;
        for (int j = 0; j < 64; ++j) {
          if (j != k) {
            final int b = order[j];
            if ((helpmat[b] & ma) != 0L) {
              helpmat[b] ^= helpmat[a];
              inv[b] ^= inv[a];
            }
          }
        }
      } else {
        for (int j = k; j < 64; ++j) {
          if ((inv[a] & ma) != 0L) {
            break;
          }
          final int b = order[j];
          if ((inv[b] & ma) != 0L) {
            long h = helpmat[b];
            helpmat[b] = helpmat[a];
            helpmat[a] = h;
            h = inv[b];
            inv[b] = inv[a];
            inv[a] = h;
          }
        }
        for (int j = 0; j < 64; ++j) {
          if (j != k) {
            final int b = order[j];
            if ((inv[b] & ma) != 0L) {
              inv[b] ^= inv[a];
              helpmat[b] ^= helpmat[a];
            }
          }
        }
        inv[a] = 0L;
        helpmat[a] = 0L;
      }
    }
    System.arraycopy(inv, 0, mW, 0, inv.length);
    return indep;
  }

  void multiplyVectorMatrix(final long[] v1, final long[] m, final long[] v2) {
    VectorTimesMatrix.multiplyVectorMatrix(v1, m, v2, mNCols);
  }

  void multiplyVectorMatrixF(final long[] v1, final long[] m, final long[] v2) {
    VectorTimesMatrix.multiplyVectorMatrixF(v1, m, v2, mNCols);
  }

  private void addVector2(final long[] v1, final long[] v2) {
    // v2 += v1
    for (int k = 0; k < v1.length; ++k) {
      v2[k] ^= v1[k];
    }
  }

  private void chooseVector(final long[] v1, final long s, final long[] v2) {
    for (int k = 0; k < v1.length; ++k) {
      v2[k] = v1[k] & s;
    }
  }

  private void addMatrix(final long[] m1, final long[] m2, final long[] m3) {
    for (int k = 0; k < m1.length; ++k) {
      m3[k] = m1[k] ^ m2[k];
    }
  }

  private long[] choose(final int nr, final long[] a, final long[] b) {
    return (nr & 64) != 0 ? a : b;
  }

  private int getIndex(final int nr) {
    final long[] hp = choose(nr, mHv1, mHv2);
    return LanczosUtils.getFirstNonZeroIndex(hp, mNCols, LanczosUtils.toMask(nr));
  }

  private int getIndexSolution(final int nr) {
    final long[] hp = choose(nr, mX, mV);
    return LanczosUtils.getFirstNonZeroIndex(hp, mNCols, LanczosUtils.toMask(nr));
  }

  private void columnExchange(final int nr1, final int nr2) {
    if (nr1 == nr2) {
      return;
    }
    LanczosUtils.columnExchange(choose(nr1, mHv1, mHv2), choose(nr2, mHv1, mHv2), mNCols, nr1, nr2);
    LanczosUtils.columnExchange(choose(nr1, mX, mV), choose(nr2, mX, mV), mNCols, nr1, nr2);
  }

  private void columnAdd(final int nr1, final int nr2) {
    if (nr1 == nr2) {
      return;
    }
    LanczosUtils.columnAdd((nr1 & 64) != 0 ? mHv1 : mHv2, (nr2 & 64) != 0 ? mHv1 : mHv2, mNCols, nr1, nr2);
    LanczosUtils.columnAdd((nr1 & 64) != 0 ? mX : mV, (nr2 & 64) != 0 ? mX : mV, mNCols, nr1, nr2);
  }


  private void findSolution() {
    Arrays.fill(mHv1, 0L);
    Arrays.fill(mHv2, 0L);
    int in1i = 0;
    int in2i = 0;
    for (int jj = 0; jj < mNColBlocks; ++jj) {
      int out1i = 0;
      int out2i = 0;
      for (final char[][] entry : mEntries) {
        final char[] mm = entry[jj];
        int mmi = 0;
        if (mm[mmi++] != 0) {
          // sparse part
          final int anz = mm[mmi++];
          for (int k = 0; k < anz; ++k) {
            final int us = mm[mmi++];
            final int q = mm[mmi++];
            mHv1[out1i + q] ^= mX[in1i + us];
            mHv2[out2i + q] ^= mV[in2i + us];
          }
        } else {
          // dense part
          int imax = mm[mmi++];
          if (imax == 0) {
            imax = BLOCKLEN;
          }
          for (int i = 0; i < imax; ++i) {
            final long h1 = mX[in1i + i];
            final long h2 = mV[in2i + i];
            final int anz = mm[mmi++];
            for (int j = 0; j < anz; ++j) {
              final int q = mm[mmi++];
              mHv1[out1i + q] ^= h1;
              mHv2[out2i + q] ^= h2;
            }
          }
        }
        out1i += BLOCKLEN;
        out2i += BLOCKLEN;
      }
      in1i += BLOCKLEN;
      in2i += BLOCKLEN;
    }

    int maxdim = 128;
    int dim = 0;
    final int[] index = new int[128];
    while (dim < maxdim) {
      for (int i = dim; i < maxdim; ++i) {
        index[i] = getIndex(i);
      }
      for (int i = dim; i < maxdim; ++i) {
        if (index[i] < 0) {
          columnExchange(dim, i);
          index[i] = index[dim];
          index[dim++] = -1;
        }
      }
      if (dim == maxdim) {
        break;
      }
      int min = mNCols + 1;
      int minind = -1;
      for (int k = dim; k < maxdim; ++k) {
        if (index[k] < min) {
          min = index[k];
          minind = k;
        }
      }
      int minanz = 0;
      for (int k = dim; k < maxdim; ++k) {
        if (index[k] == min) {
          ++minanz;
        }
      }
      if (minanz > 1) {
        for (int i = minind + 1; i < maxdim; ++i) {
          if (index[i] == min) {
            columnAdd(minind, i);
          }
        }
      } else {
        --maxdim;
        columnExchange(minind, maxdim);
      }
    }
    mOut.print(dim + " ");

    // find linear independent solutions
    dim = 0;
    while (dim < maxdim) {
      for (int i = dim; i < maxdim; ++i) {
        index[i] = getIndexSolution(i);
      }
      for (int i = dim; i < maxdim; ++i) {
        if (index[i] < 0) {
          columnExchange(--maxdim, i);
          index[i] = index[maxdim];
          index[maxdim] = -1;
        }
      }
      if (dim == maxdim) {
        break;
      }
      int min = mNCols + 1;
      int minind = -1;
      for (int i = dim; i < maxdim; ++i) {
        if (index[i] < min) {
          min = index[i];
          minind = i;
        }
      }
      int minanz = 0;
      for (int i = dim; i < maxdim; ++i) {
        if (index[i] == min) {
          ++minanz;
        }
      }
      if (minanz > 1) {
        for (int i = minind + 1; i < maxdim; ++i) {
          if (index[i] == min) {
            columnAdd(minind, i);
          }
        }
      } else {
        columnExchange(minind, dim++);
      }
    }
    mOut.print(dim + " ");
  }


  private long[] insertDeletedColumns() {
    final int anz = mNCols + mDeletedCols.length;
    final long[] result = new long[anz];
    int ind = 0;
    for (int i = 0; i < mNCols; ++i) {
      while (ind < mDeletedCols.length && i + ind >= mDeletedCols[ind]) {
        ++ind;
      }
      result[i + ind] = mV[i];
    }
    return result;
  }

  private void writeVector(final long[] v, final int len, final String fname) {
    final int nonzero = LanczosUtils.countNonZeroCols(v, len);
    try {
      try (final DataOutputStream dos = new DataOutputStream(new FileOutputStream(fname))) {
        dos.writeInt(Integer.reverseBytes(len));
        dos.writeInt(Integer.reverseBytes(nonzero));
        for (int i = 0; i < len; ++i) {
          dos.writeLong(LongUtils.endian(v[i]));
        }
      }
    } catch (final IOException e) {
      System.err.println("Cannot open " + fname);
    }
    mOut.println(" " + nonzero + " solutions");
  }

  private long mS;
  private int mTotalDimension = 0;
  private int mRound = 0;
  private int mDimension = 0;

  private static void writeCheckpoint(final Lanczos lanc) {
    try {
      try (final ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("lanczos." + lanc.mRound + ".checkpoint")))) {
        oos.writeObject(lanc);
      }
    } catch (final IOException e) {
      System.err.println("Failed to write checkpoint");
    }
  }
  
  private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    mOut = System.out;
  }

  private static Lanczos readCheckpoint(final String filename) throws IOException {
    try (final ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
      return (Lanczos) ois.readObject();
    } catch (final ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  private void iteration() {
    MultiplyVector.multiplyVector(mHv1, mVAAV);
    assert mTotalDimension <= mNRows + 128 : "Too many iterations";
    final int oldDimension = mDimension;
    final long oldS = mS;
    mDimension = findW(); // NB: can modify mS
    mTotalDimension += mDimension;
    mOut.print("\rTotal dimension: " + mTotalDimension);
    MatrixTimesMatrix.multiplyMatrix(mW, mVTV, mHm1);
    multiplyVectorMatrix(mV, mHm1, mHv2);
    addVector2(mHv2, mX);

    chooseVector(mVAAV, mS, mD);
    addMatrix(mD, mVAV, mVVV);
    MatrixTimesMatrix.multiplyMatrix(mW, mVVV, mD);
    addMatrix(mD, ULLMASK, mD);

    chooseVector(mVAV, mS, mE);
    MatrixTimesMatrix.multiplyMatrix(mWo, mE, mE);

    if (oldS != ~0L) {
      MatrixTimesMatrix.multiplyMatrix(mVAVo, mWo, mF);
      addMatrix(mF, ULLMASK, mF);
      MatrixTimesMatrix.multiplyMatrix(mWoo, mF, mF);
      MatrixTimesMatrix.multiplyMatrix(mF, mVVVo, mF);
      chooseVector(mF, mS, mF);
    }

    chooseVector(mHv1, mS, mHv1);
    multiplyVectorMatrix(mV, mD, mHv2);
    addVector2(mHv2, mHv1);
    multiplyVectorMatrix(mVo, mE, mHv2);
    addVector2(mHv2, mHv1);
    if (oldS != ~0L) {
      if (oldDimension == 63) {
        multiplyVectorMatrixF(mVoo, mF, mHv2);
      } else {
        multiplyVectorMatrix(mVoo, mF, mHv2);
      }
      addVector2(mHv2, mHv1);
    }

    if (mRound > 1) {
      MatrixTimesMatrix.multiplyMatrixTMatrix(mD, mVTV, mHm1);
      MatrixTimesMatrix.multiplyMatrixTMatrix(mE, mVTVo, mHm2);
      addMatrix(mHm1, mHm2, mHm1);
      if (oldS != ~0L) {
        MatrixTimesMatrix.multiplyMatrixTMatrix(mF, mVTVoo, mHm2);
        addMatrix(mHm1, mHm2, mHm1);
      }
    } else {
      VectorTimesVector.multiplyVectorVector(mHv1, mV0, mHm1, mNCols);
    }

    long[] t = mVoo;
    mVoo = mVo;
    mVo = mV;
    mV = mHv1;
    mHv1 = t;
    t = mVAVo;
    mVAVo = mVAV;
    mVAV = t;
    t = mWoo;
    mWoo = mWo;
    mWo = mW;
    mW = t;
    t = mVVVo;
    mVVVo = mVVV;
    mVVV = t;
    t = mVTVoo;
    mVTVoo = mVTVo;
    mVTVo = mVTV;
    mVTV = mHm1;
    mHm1 = t;
    multiplySparseMatrixVector(mV, mHv1);
    MultiplyVector.multiplyVector(mHmul, mVAV);
    ++mRound;
    if (mCheckpointing && mRound % 5000 == 0) {
      writeCheckpoint(this);
      mOut.println("Wrote checkpoint");
    }
  }

  void lanczos() {
    LongUtils.random(mX);
    multiplySparseMatrixVector(mX, mV0);
    System.arraycopy(mV0, 0, mV, 0, mV0.length);
    VectorTimesVector.multiplyVectorVector(mV0, mV0, mVTV, mNCols);
    mS = ~0L;
    multiplySparseMatrixVector(mV, mHv1);
    MultiplyVector.multiplyVector(mHmul, mVAV);
    while (!LanczosUtils.isZero(mVAV)) {
      iteration();
    }

    findSolution();
    if (mDeletedCols == null) {
      writeVector(mV, mNCols, "result.ker");
    } else {
      writeVector(insertDeletedColumns(), mNCols + mDeletedCols.length, "result.ker");
    }
  }

  static void resume(final String filename) throws IOException {
    final Lanczos l = readCheckpoint(filename);
    while (!LanczosUtils.isZero(l.mVAV)) {
      l.iteration();
    }

    l.findSolution();
    if (l.mDeletedCols == null) {
      l.writeVector(l.mV, l.mNCols, "result.ker");
    } else {
      l.writeVector(l.insertDeletedColumns(), l.mNCols + l.mDeletedCols.length, "result.ker");
    }
  }

  /**
   * Solve a matrix with block Lanczos.
   *
   * @param args see usage
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    if (args == null || args.length < 1) {
      System.err.println("USAGE: Lanczos basename");
      System.err.println("USAGE: Lanczos -r checkpoint-filename");
      return;
    }
    if ("-r".equals(args[0])) {
      resume(args[1]);
      return;
    }

    //    final String basename = args[0];
    final String matName = args[0] + ".comp";
    //    final String kerName = args[0] + ".ker";

    try {
      final Lanczos m = LanczosReadMatrix.readReduceMatrix(matName, System.out);
      m.init();
      m.lanczos();
    } catch (final IOException e) {
      System.err.println("Cannot open " + matName);
    }
  }
}
