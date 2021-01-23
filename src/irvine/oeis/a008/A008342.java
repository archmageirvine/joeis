package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicIntArray;

/**
 * A008342 Minimal number of shift, add and subtract operations to multiply by n.
 * @author Sean A. Irvine
 */
public class A008342 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mMin = new DynamicIntArray();
  private final DynamicArray<String> mOp = new DynamicArray<>();
  private int mN = 0;
  private int mSteps = 0;
  private int mMaxN = 1;
  {
    mOp.set(1, "1");
  }

  private String nonZeroToString(final int[] seq) {
    final StringBuilder sb = new StringBuilder();
    for (final int v : seq) {
      if (v > 0) {
        if (sb.length() > 0) {
          sb.append(", ");
        }
        sb.append(v);
      }
    }
    return sb.toString();
  }

  private void updateBest(final int[] seq, final int n, final int w) {
    if (mMin.get(w) == 0 || mMin.get(w) > n) {
      mMin.set(w, n);
      if (mVerbose) {
        // Only bother retaining the actual steps if we want to print them later
        mOp.set(w, nonZeroToString(seq));
      }
    }
  }

  private boolean checkNotPresent(final int[] seq, final int n, final int v) {
    // Purely for efficiency, it cannot be better to have the same value in
    // the sequence more than once!
    for (int k = 0; k < n; ++k) {
      if (seq[k] == v) {
        return false;
      }
    }
    return true;
  }

  private void search(final int[] seq, final int n) {
    if (n <= mSteps) {
      // Shifts of previous elements
      // Shifting just the last element is not sufficient, cf. n=597.
      for (int k = 0; k < n; ++k) {
        int shift = 2; // Shift of 1 is always doable with addition
        final int v = seq[k];
        int w;
        while ((w = v << shift) <= mMaxN) {
          if (checkNotPresent(seq, n, w)) {
            seq[n] = w;
            updateBest(seq, n, w);
            search(seq, n + 1);
          }
          ++shift;
        }
      }
      // Add/subtract last element with any element
      final int v = seq[n - 1];
      for (int k = 0; k < n; ++k) {
        final int add = v + seq[k];
        if (add <= mMaxN && checkNotPresent(seq, n, add)) {
          seq[n] = add;
          updateBest(seq, n, add);
          search(seq, n + 1);
        }
        if (seq[k] < v) {
          final int sub = v - seq[k];
          if (checkNotPresent(seq, n, sub)) {
            seq[n] = sub;
            updateBest(seq, n, sub);
            search(seq, n + 1);
          }
        }
        seq[n] = 0;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mN > mMaxN) {
        // Step up to the next power of 2
        mMaxN <<= 1;
      }
      while (mMin.get(mN) == 0) {
        // Need more steps to get the answer
        final int[] seq = new int[++mSteps + 1];
        seq[0] = 1;
        search(seq, 1);
      }
    }
    if (mVerbose) {
      System.out.println(mN + " " + mMin.get(mN) + " [" + mOp.get(mN) + "]");
    }
    return Z.valueOf(mMin.get(mN));
  }
}


