package irvine.oeis.a005;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A005329 a(n) = Product_{i=1..n} (2^i - 1). Also called 2-factorial numbers.
 * @author Sean A. Irvine
 */
public class A005329 extends Sequence0 implements DirectSequence {

  protected int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(mN).subtract(1));
    }
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return Integers.SINGLETON.product(1, n, i -> Z.ONE.shiftLeft(i).subtract(1));
  }

}
