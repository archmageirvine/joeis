package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A003418 Least common multiple (or LCM) of {1, 2, ..., n} for n &gt;= 1, a(0) = 1.
 * @author Sean A. Irvine
 */
public class A003418 extends Sequence0 implements DirectSequence {

  protected long mN = -1;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mLcm = mLcm.lcm(Z.valueOf(mN));
    }
    return mLcm;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    // a(n) = Product_{k=2..n} (1 + (A007947(k)-1)*floor(1/A001221(k))), for n > 1.
    if (n <= 1) {
      return Z.ONE;
    }
    return Integers.SINGLETON.product(2, n, k -> Z.ONE.add(Functions.SQUARE_FREE_KERNEL.z(k).subtract(1).multiply(Functions.OMEGA.i(k) > 1 ? 0 : 1)));
  }

}
