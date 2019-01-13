package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A000682.
 * @author Sean A. Irvine
 */
public class A000682 implements Sequence {

  private static final class IntArray extends DynamicIntArray {

    private final int mMax;

    private IntArray(final int max) {
      super();
      mMax = max;
    }

    @Override
    public void set(final int a, final int b) {
      super.set(a + mMax, b);
    }

    @Override
    public int get(final int a) {
      return super.get(a + mMax);
    }
  }

  private int mMax = 0;
  private int mN = -1;
  private long[] mSm = null;

  @Override
  public Z next() {
    // Uses approach based on Francesco, Golinelli, Guitter
    // Symmetry optimizations have not been applied.
    // Speeding this up would also speed up some other sequences
    // Faster approach is known, see Jensen
    if (++mN >= mMax) {
      mMax += 4; // Compromise on speed vs terms generated
      mSm = new long[mMax + 1];
      final DynamicIntArray a = new IntArray(mMax);
      a.set(0, 1);
      int n = 0;
      while (true) {
        mSm[n++]++;
        int j = 1 - n;
        while (n == mMax || j == n + 1) {
          a.set(a.get(1 - n), a.get(n));
          a.set(a.get(n), a.get(1 - n));
          j = a.get(n) + 1;
          if (--n == 0) {
            return Z.valueOf(mSm[mN]);
          }
        }
        a.set(a.get(j), n + 1);
        a.set(n + 1, a.get(j));
        a.set(j, -n);
        a.set(-n, j);
      }
    }
    return Z.valueOf(mSm[mN]);
  }
}

