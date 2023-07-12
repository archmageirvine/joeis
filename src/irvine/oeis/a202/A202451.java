package irvine.oeis.a202;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A202451 Upper triangular Fibonacci matrix, by SW antidiagonals.
 * @author Georg Fischer
 */
public class A202451 extends Triangle {

  private Z mFib0;
  private Z mFib1;

  /** Construct the sequence. */
  public A202451() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    final int nh = n / 2;
    if ((n & 1) == 0) { // even row 4: 0 0 1 2 5
      if (k < nh) {
        return Z.ZERO;
      } else if (k == nh) {
        mFib0 = Z.ZERO;
        mFib1 = Z.ONE;
        return mFib1;
      } else {
        Z fib2 = mFib0.add(mFib1);
        mFib0 = mFib1;
        mFib1 = fib2;
        fib2 = mFib0.add(mFib1);
        mFib0 = mFib1;
        mFib1 = fib2;
        return mFib1;
      }
    } else { // odd row 5: 0 0 0 1 3 8
      if (k <= nh) {
        return Z.ZERO;
      } else if (k == nh + 1) {
        mFib0 = Z.ONE;
        mFib1 = Z.ONE;
        return mFib1;
      } else {
        Z fib2 = mFib0.add(mFib1);
        mFib0 = mFib1;
        mFib1 = fib2;
        fib2 = mFib0.add(mFib1);
        mFib0 = mFib1;
        mFib1 = fib2;
        return mFib1;
      }
    }
  }
}
