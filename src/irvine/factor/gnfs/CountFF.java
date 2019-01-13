package irvine.factor.gnfs;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

import irvine.util.array.DynamicByteArray;
import irvine.util.array.DynamicIntArray;
import irvine.util.io.IOUtils;

/**
 * Count relations resulting from sieving.
 *
 * @author Sean A. Irvine
 */
public final class CountFF {

  private CountFF() { }

  private static int sNff = 0;
  private static int sNPFree = 0;

  /** Most significant parts of large primes. */
  private static DynamicByteArray[] sLPms = new DynamicByteArray[0];
  /** Least significant parts of large primes. */
  private static DynamicIntArray[] sLPls = new DynamicIntArray[0];
  /** Large prime counts. */
  private static int[] sLPcount = new int[0];

  /*
   * Append data from ifile into large prime arrays.
   */
  private static void readInputFile(final File ifile) throws IOException {
    System.out.println("Reading: " + ifile);
    try (final DataInputStream dis = new DataInputStream(new BufferedInputStream(IOUtils.decompressedStream(ifile)))) {
      final int newLPMax = Integer.reverseBytes(dis.readInt());
      final int[] numberNewRelations = new int[newLPMax + 1];
      for (int i = 0; i < numberNewRelations.length; ++i) {
        numberNewRelations[i] = Integer.reverseBytes(dis.readInt());
      }
      sNff += numberNewRelations[0];
      if (newLPMax != 0) {
        if (newLPMax > sLPms.length) {
          final DynamicByteArray[] t = new DynamicByteArray[newLPMax];
          System.arraycopy(sLPms, 0, t, 0, sLPms.length);
          sLPms = t;
          final DynamicIntArray[] t2 = new DynamicIntArray[newLPMax];
          System.arraycopy(sLPls, 0, t2, 0, sLPls.length);
          sLPls = t2;
          final int[] tt = new int[newLPMax];
          System.arraycopy(sLPcount, 0, tt, 0, sLPcount.length);
          sLPcount = tt;
        }
        for (int i = 0; i < newLPMax; ++i) {
          final int ii = i + 1;
          if (numberNewRelations[ii] > 0) {
            if (sLPcount[i] == 0) {
              sLPls[i] = new DynamicIntArray();
              sLPms[i] = new DynamicByteArray();
            }
            final int s = numberNewRelations[ii] * ii;
            final int limit = s + ii * sLPcount[i];
            final DynamicIntArray ls = sLPls[i];
            for (int j = ii * sLPcount[i]; j < limit ; ++j) {
              ls.set(j, Integer.reverseBytes(dis.readInt()));
            }
            final DynamicByteArray ms = sLPms[i];
            for (int j = ii * sLPcount[i]; j < limit; ++j) {
              ms.set(j, dis.readByte());
            }
            sLPcount[i] += numberNewRelations[ii];
            assert ls.length() == ii * sLPcount[i] && ms.length() == ls.length();
          }
        }
      }
    }
  }

  private static String sBasename = null;

  private static final int HASH_BITS = 20;
  private static final int HASHSIZE = 1 << HASH_BITS;
  private static short[][] sHashtable;
  private static int[] sHashtableCount;
  private static final int HASHMASK = HASHSIZE - 1;
  private static final int IDIND_BITS = 3;

  private static void readHashtable(final File f) throws IOException {
    sHashtable = new short[HASHSIZE][];
    sHashtableCount = new int[HASHSIZE];
    try (final DataInputStream is = new DataInputStream(new BufferedInputStream(new FileInputStream(f)))) {
      for (int i = 0; i < HASHSIZE; ++i) {
        sHashtableCount[i] = is.readInt();
      }
      for (int i = 0; i < HASHSIZE; ++i) {
        final int count = sHashtableCount[i];
        if (count != 0) {
          sHashtable[i] = new short[count];
          for (int j = 0; j < count; ++j) {
            sHashtable[i][j] = is.readShort();
          }
        }
      }
    }
  }

  private static void readFrankeHashtable(final File f) throws IOException {
    sHashtable = new short[HASHSIZE][];
    sHashtableCount = new int[HASHSIZE];
    try (final DataInputStream is = new DataInputStream(new BufferedInputStream(new FileInputStream(f)))) {
      is.readInt(); // passover length
      for (int i = 0; i < HASHSIZE; ++i) {
        sHashtableCount[i] = Integer.reverseBytes(is.readInt());
      }
      for (int i = 0; i < HASHSIZE; ++i) {
        final int count = sHashtableCount[i];
        if (count != 0) {
          sHashtable[i] = new short[count];
          for (int j = 0; j < count; ++j) {
            sHashtable[i][j] = Short.reverseBytes(is.readShort());
          }
        }
      }
    }
  }

  private static void dumpHashtable(final OutputStream os) throws IOException {
    final DataOutputStream dos = new DataOutputStream(os);
    dos.writeInt(Integer.reverseBytes(sLPms.length));
    for (final int aSHashtableCount : sHashtableCount) {
      dos.writeInt(Integer.reverseBytes(aSHashtableCount));
    }
    for (int i = 0; i < sHashtableCount.length; ++i) {
      final int count = sHashtableCount[i];
      for (int j = 0; j < count; ++j) {
        dos.writeShort(Short.reverseBytes(sHashtable[i][j]));
      }
    }
    os.flush();
  }

  private static int[] sHT2R;
  private static final int ID2IND_BITS = 4;
  private static int sNFreeRels;
  private static final DynamicIntArray FREERELS = new DynamicIntArray();

  private static int hashtabToMatrixInit() {
    int nr = 0;
    sHT2R = new int[HASHSIZE + 1];
    for (int ch = 0; ch < HASHSIZE; ++ch) {
      final short[] v = sHashtable[ch];
      sHT2R[ch] = nr;
      if (v != null) {
        if (sNPFree > 1) {
          Arrays.sort(v);  // May differ from Franke
        }
        for (int y, x = 0; x < v.length; x = y) {
          final int h = v[x] >>> ID2IND_BITS;
          for (y = x + 1; y < v.length; ++y) {
            if ((v[y] >>> ID2IND_BITS) != h) {
              break;
            }
          }
          if (y - x == sNPFree) {
            for (int i = 0; i < sNPFree; ++i) {
              FREERELS.set(sNPFree * sNFreeRels + i, nr + i);
            }
            ++sNFreeRels;
            for (int z = x; z < y; ++z) {
              v[z] |= 1;
            }
            nr += sNPFree;
          } else {
            for (int z = x; z < y; ++z) {
              nr += v[z] & 1;
            }
          }
        }
      }
    }
    sHT2R[HASHSIZE] = nr;
    return nr;
  }

  private static int getRow(final int ls, final byte ms) {
    final int hashval = ls & HASHMASK;
    final int x = ((ls >>> HASH_BITS) << IDIND_BITS) + (ms & 0xFF);
    final short hashtag = (short) ((x << 1) + 1);
    for (int i = 0, res = sHT2R[hashval]; i < sHashtableCount[hashval]; ++i) {
      if (sHashtable[hashval][i] == hashtag) {
        return res;
      } else {
        res += sHashtable[hashval][i] & 1;
      }
    }
    return ~0;
  }

  /** Largest possible unsigned byte value. */
  private static final byte MAX_BYTE = (byte) ~0;

  private static File writeIncrementalHashtable(final IncrementalHash ih) throws IOException {
    final File file = File.createTempFile("gnfs", "hash");
    try (final BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(file))) {
      ih.dump(os);
    }
    return file;
  }

  private static IncrementalHash printInitialStatus() {
    final IncrementalHash ih = new IncrementalHash();
    for (int i = 0; i < sLPms.length; ++i) {
      System.out.print((i == 0 ? "(" : ", ") + sLPcount[i]);
      System.out.flush();
      for (int j = 0; j < (i + 1) * sLPcount[i]; ++j) {
        ih.hash(sLPls[i].get(j), sLPms[i].get(j));
      }
    }
    System.out.print(')');
    return ih;
  }

  private static File dumpHashtable() throws IOException {
    final File hashfile = File.createTempFile("gnfs", "hash");
    try (final BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(hashfile))) {
      dumpHashtable(os);
    }
    return hashfile;
  }

  private static void processTables(final byte[] rowBitCount) {
    for (int i = 0; i < HASHSIZE; ++i) {
      final short[] htBuf = sHashtable[i];
      final int oldhtc = sHashtableCount[i];
      int k = 0;
      for (int r = sHT2R[i]; r < sHT2R[i + 1]; ++r) {
        if (rowBitCount[r] != 0) {
          ++k;
        }
      }
      final short[] t = new short[k];
      sHashtable[i] = t;
      sHashtableCount[i] = k;
      k = 0;
      int r = sHT2R[i];
      for (int j = 0; j < oldhtc; ++j) {
        if ((htBuf[j] & 1) != 0 && rowBitCount[r++] != 0) {
          t[k++] = htBuf[j];
        }
      }
      if (k != sHashtableCount[i]) {
        throw new RuntimeException("Expected " + sHashtableCount[i] + " entries in " + i + "th page or pruned hash table, have " + k);
      }
      if (r != sHT2R[i + 1]) {
        throw new RuntimeException("Expected rows from " + sHT2R[i] + " to " + sHT2R[i + 1] + " to correspond to initial hashtable, have only rows <" + r);
      }
    }
  }

  private static void buildRBuffer(final int nr) {
    final int[] rbuf = new int[sLPms.length];
    for (int i = 0; i < sLPls.length; ++i) {
      final DynamicIntArray lp = sLPls[i];
      final int ii = i + 1;
      System.out.print(i == 0 ? "(" : ", ");
      int jj = 0;
      loop:
      for (int j = 0; j < ii * sLPcount[i]; j += ii) {
        for (int k = 0; k <= i; ++k) {
          final int res = getRow(lp.get(j + k), sLPms[i].get(j + k));
          if (res == ~0) {
            continue loop;
          }
          rbuf[k] = res;
          assert rbuf[k] < nr : "Row index " + rbuf[k] + " exceeds number of rows " + nr;
        }
        for (int q = 0; q < ii; ++q) {
          lp.set(jj + q, rbuf[q]);
        }
        jj += ii;
      }
      sLPcount[i] = jj / ii;
      System.out.print(String.valueOf(sLPcount[i]));
      sLPms[i] = null;
    }
    System.out.println(')');
  }

  private static void writeHashtable() throws IOException {
    try (final OutputStream os = new FileOutputStream(sBasename + ".hash")) {
      dumpHashtable(os);
    }
  }

  private static void prune() throws IOException {
    System.out.print("Pruning");
    final File file = writeIncrementalHashtable(printInitialStatus());
    readHashtable(file);
    if (file.exists() && !file.delete()) {
      throw new IOException();
    }
    final int nr = hashtabToMatrixInit();
    System.out.print("-F" + sNFreeRels + "->");
    final File hashfile = dumpHashtable();
    buildRBuffer(nr);
    sHashtable = null;
    sHashtableCount = null;
    byte[] rowBitCount = null;
    for (int np = 0, np1 = 2; np1 > 1; np += np1) {
      rowBitCount = new byte[nr];
      System.out.print("Creating ");
      for (int i = 0; i < sNPFree * sNFreeRels; ++i) {
        final int x = FREERELS.get(i);
        if (rowBitCount[x] != MAX_BYTE) {
          rowBitCount[x]++;
        }
      }
      System.out.println("bitcount");
      for (int i = 0; i < sLPls.length; ++i) {
        final DynamicIntArray lp = sLPls[i];
        for (int j = 0; j < (i + 1) * sLPcount[i]; ++j) {
          final int x = lp.get(j);
          if (rowBitCount[x] != MAX_BYTE) {
            rowBitCount[x]++;
          }
        }
      }
      boolean continueFlag = true;
      for (np1 = 0; continueFlag; ++np1) {
        System.out.print("Pass" + (np + np1) + "A: ");
        continueFlag = false;
        int jj = 0;
        for (int j = 0; j < sNPFree * sNFreeRels; j += sNPFree) {
          int k;
          for (k = j; k < j + sNPFree; ++k) {
            if (rowBitCount[FREERELS.get(k)] < 2) {
              break;
            }
          }
          if (k < j + sNPFree) {
            for (k = j; k < j + sNPFree; ++k) {
              final int x = FREERELS.get(k);
              if (rowBitCount[x] != MAX_BYTE) {
                assert rowBitCount[x] != 0 : "rowBitCount[" + x + "=freerels[" + k + "]]==0";
                if (--rowBitCount[x] == 1) {
                  continueFlag = true;
                }
              }
            }
          } else {
            if (jj < j) {
              for (int q = 0; q < sNPFree; ++q) {
                FREERELS.set(jj + q, FREERELS.get(j + q));
              }
            }
            jj += sNPFree;
          }
        }
        if (sNPFree > 0) {
          System.out.print("F: " + sNFreeRels + "->" + jj / sNPFree + " ");
          sNFreeRels = jj / sNPFree;
          FREERELS.truncate(jj);
        }
        for (int i = 0; i < sLPls.length; ++i) {
          final DynamicIntArray lp = sLPls[i];
          final int ii = i + 1;
          jj = 0;
          for (int j = 0; j < ii * sLPcount[i]; j += ii) {
            int k;
            for (k = j; k <= j + i; ++k) {
              if (rowBitCount[lp.get(k)] < 2) {
                break;
              }
            }
            if (k <= j + i) {
              for (k = j; k <= j + i; ++k) {
                final int x = lp.get(k);
                if (rowBitCount[x] != MAX_BYTE) {
                  assert rowBitCount[x] != 0 : "rowBitCount[" + x + "=freerels[" + k + "]]==0";
                  if (--rowBitCount[x] == 1) {
                    continueFlag = true;
                  }
                }
              }
            } else {
              if (jj < j) {
                for (int q = 0; q < ii; ++q) {
                  lp.set(jj + q, lp.get(j + q));
                }
              }
              jj += ii;
            }
          }
          System.out.print(ii + ": " + sLPcount[i] + "->" + jj / ii + " ");
          sLPcount[i] = jj / ii;
          if (lp != null) {
            lp.truncate(jj);
          }
        }
        System.out.println();
      }
    }
    int nNodes = 0;
    for (int i = 0; i < nr; ++i) {
      if (rowBitCount[i] > 0) {
        ++nNodes;
      }
    }
    readFrankeHashtable(hashfile);
    processTables(rowBitCount);
    int nRel;
    System.out.println(nNodes + " nodes, " + sNff + " full relations.");
    if (sNPFree < 2) {
      nRel = 0;
      System.out.print("Survivors: ");
      for (int i = 0; i < sLPms.length; ++i) {
        System.out.print(sLPcount[i] + " " + (i + 1) + "-pf" + (i + 1 == sLPms.length ? "." : ", "));
        nRel += sLPcount[i];
      }
      System.out.println();
    } else {
      nRel = sNFreeRels;
      System.out.print("Non-free Survivors: ");
      for (int i = 0; i < sLPms.length; ++i) {
        System.out.print(sLPcount[i] + " " + (i + 1) + "-pf" + (i + 1 == sLPms.length ? "." : ", "));
        nRel += sLPcount[i];
      }
      System.out.println();
      System.out.println(sNFreeRels + " free relations consisting of large primes have been added.");
    }
    if (nRel > nNodes) {
      nRel -= nNodes;
    } else {
      nRel = 0;
    }
    System.out.println("At least " + (sNff + nRel) + "=" + sNff + "+" + nRel + " relations can be created.");
    writeHashtable();
  }

  /**
   * Count relations.
   *
   * @param args see usage
   * @exception Exception if an error occurs.
   */
  public static void main(final String... args) throws Exception {
    sBasename = null;
    for (int ai = 0; ai < args.length; ++ai) {
      if ("-F".equals(args[ai])) {
        sNPFree = Integer.parseInt(args[++ai]);
      } else {
        sBasename = args[ai];
      }
    }
    if (sBasename == null || sNPFree == 0) {
      System.err.println("USAGE: CountFF -F n basename");
      return;
    }

    // process each file in chop directory
    final File chopDir = new File(sBasename + ".chopd");
    if (!chopDir.isDirectory()) {
      throw new RuntimeException(chopDir + " was not a directory");
    }
    final File[] chopFiles = chopDir.listFiles();
    if (chopFiles != null) {
      try {
        for (final File chopFile : chopFiles) {
          readInputFile(chopFile);
        }
      } catch (final IOException e) {
        e.printStackTrace();
      }
    }
    prune();
  }
}

