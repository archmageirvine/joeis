package irvine.oeis.a077;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077045 Doubly restricted composition numbers: number of compositions of 1+2+3+...+n = n(n+1)/2 into exactly n positive integers each no more than n.
 * @author Sean A. Irvine
 */
public class A077045 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int h, final int t) {
      if (t * h < n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(0, Math.min(n, h),
        j -> get(n - j, Math.min(h, n - j), t - 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN * (mN - 1) / 2, mN - 1, mN);
  }
}

