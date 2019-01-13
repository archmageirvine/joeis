package irvine.oeis.a004;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004137.
 * @author Sean A. Irvine
 */
public class A004137 implements Sequence {

  // After Klaus Nagel

  private int mN = 0;
  private int mM = 0;
  private final ArrayList<int[]> mProtocol = new ArrayList<>();
  private int mProtocolIndex;
  private long mSolutions;     // counter for solutions (equivalent Solution once)
  //private int mSolutions1;    // counter for solutions (non-symmetric twice)
  private int mLimit;           // l - binomial(m, 2)
  private int[] mPerm = null;
  private boolean mStop = false;
  private int[] mMark = new int[0x100000];
  //private double[] mSanz = new double[100];
  //private int mRepeatedSolutions;

  private int[] getProtocol(final int m, final int i) {
    while (i >= mProtocol.size()) {
      mProtocol.add(new int[m]);
    }
    return mProtocol.get(i);
  }

  private void makeLuschnySet(final int k, final int[] a, final int[] lus) {
    Arrays.fill(lus, 0);
    for (int i = 1; i < k; ++i) {
      for (int j = 0; j < i; ++j) {
        lus[Math.abs(a[i] - a[j])]++;
      }
    }
  }

  private boolean[] getIndexes(final int m, final int l, final int[] a) {
    final boolean[] index = new boolean[l + 1];
    for (int i = 0; i < m; ++i) {
      index[a[i]] = true;  // For sorting
    }
    return index;
  }

//  private int sym(final int m, final int l, final int[] a) {
//    final boolean[] index = getIndexes(m, l, a);
//    for (int i = 0, j = l; i < j; ++i, j--) {
//      if (index[i] != index[j]) {
//        return 2;
//      }
//    }
//    return 1;
//  }

  /*
   * Determines an unique representative from a class of
   * equivalent solutions and writes it to the protocol at pointer.
   */
  private void rep(final int m, final int l, final int[] a, final int pointer) {
    final boolean[] index = getIndexes(m, l, a);

    final int[] b = new int[m - 1];
    final int[] pp = getProtocol(m, pointer);
    for (int i = 1, j = 0, k = 0; i <= l; ++i) {
      if (index[i]) {
        final int t = i - j;
        pp[k] = t;
        b[m - 2 - k] = t;
        j = i;
        ++k;
      }
    }
    for (int i = 0; i < m - 2; ++i) {
      if (b[i] < pp[i]) {
        System.arraycopy(b, 0, pp, 0, m - 2);
        return;
      }
      if (pp[i] < b[i]) {
        return;
      }
    }
  }

  private int key(final int l, final int k, final int[] a) {
    int x = 0;
    final int m = 1 << 19;
    for (int i = 0; i < k; ++i) {
      if (a[i] > 9 && a[i] < l - 9) {
        return -1;
      }
      if (a[i] < 10) {
        x |= 1 << a[i];
      }
      if (a[i] > l - 10) {
        x |= m >>> (l - a[i]);
      }
    }
    return x;
  }

  private int invert(int x) {
    int y = 0;
    int m = 1 << 19;
    while (x != 0) {
      if ((x & 1) != 0) {
        y |= m;
      }
      m >>= 1;
      x >>= 1;
    }
    return y;
  }

  private void setMarks(final int l, final int k, final int[] a) {
    final int x = key(l, k, a);
    if (x != -1) {
      mMark[x] |= 1 << k;
      mMark[invert(x)] |= 1 << k;
    }
  }

  // The marks a[0] through a[k-1] are set, a[k] is to be calculated
  private void search(final int m, final int l, final int k, final int[] a, final int[] lfeld) {
    //mSanz[k]++;
    if (k > m || mStop) {
      return;
    }
    final int x = key(l, k, a);
    if (k < 10 && x != -1 && mMark[x] != 0) {
      return;
    }

    // Determine all lengths yet measurable
    // Excess  (A length can be measured excess times too often)
    int sum = 0;
    for (final int f : lfeld) {
      if (f > 1) {
        sum += f - 1;
      }
    }
    if (sum > mLimit) {
      return;  // Not all lengths can be reached any more
    }

    // Look for greatest missing length
    int lang = l - 2;
    for (; lang > 1; --lang) {  // The Marks 0, 1, l are fixed
      if (lfeld[lang] == 0) {
        final int[] index = new int[l + 1];
        for (int i = 0; i < k; ++i) {
          int p = a[i] + lang;
          if (p < l) {
            index[p]++;
          }
          p = a[i] - lang;
          if (p > 0) {
            index[p]++;
          }
        }
        // For all marks satisfying "lang"
        for (int ii = 3; ii <= l; ++ii) {
          final int i = mPerm[ii];
          if (index[i] != 0) {
            a[k] = i;
            final int[] lus = Arrays.copyOf(lfeld, lfeld.length);
            for (int j = 0; j < k; ++j) {
              lus[Math.abs(i - a[j])]++;
            }
            search(m, l, k + 1, a, lus);   // This is the recursive call
            if (k < 9) {
              setMarks(l, k + 1, a);
            }
          }
        }
        return;
      }
    }

    // Solution, because no missing length was found
    rep(m, l, a, mProtocolIndex);  // enter solution in protocol
    for (int i = 0; i < mProtocolIndex; ++i) {
      int j = 0;
      for (; j < m - 2; ++j) {
        if (getProtocol(m, mProtocolIndex)[j] != getProtocol(m, i)[j]) {
          break;
        }
      }
      if (j == m - 2) {
        // No deviation between entries i and mProtocolIndex, solution is not new.
        //mRepeatedSolutions++;
        return;
      }
    }

    // No equivalent solution found in protocol
    ++mProtocolIndex;
    ++mSolutions;
    //mSolutions1 += sym(m, l, a);
    mStop = true;
  }

  // Find solution
  private long comb(final int m, final int l) {
    Arrays.fill(mMark, 0);
    mLimit = (m - 1) * m / 2 - l;
    final int[] a = new int[m];
    int t = 0;
    a[t++] = 0;  // Marks 0 and l necessary for length l
    if (m > 1) {
      a[t++] = l;
      if (m > 2) {
        a[t++] = 1;  // without loss of generality for length l-1
      }
    }
    final int[] lus = new int[l + 1];
    makeLuschnySet(Math.min(3, a.length), a, lus);

    // Generate permutations starting on the outside working toward the centre
    mPerm = new int[l + 1];
    for (int i = 0; i <= l; ++i) {
      mPerm[i] = (i & 1) != 0 ? l - (i >>> 1) : i >>> 1;
    }

    mProtocolIndex = 0;
    mProtocol.clear();
    mSolutions = 0;
    //mSolutions1 = 0;
    //mRepeatedSolutions = 0;
    //Arrays.fill(mSanz, 0);
    mStop = false;

    search(m, l, t, a, lus);

    return mSolutions;
  }

  @Override
  public Z next() {
    ++mN;
    while (comb(mN, mM) > 0) {
      ++mM;
    }
    return Z.valueOf(mM - 1);
  }
}
