package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000128 A nonlinear binomial sum.
 * @author Sean A. Irvine
 */
public class A000128 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final A000045 mFib = new A000045();
  {
    mFib.next();
    mFib.next();
    mFib.next();
    mFib.next();
    mFib.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z f = mFib.next();
    return f.subtract(mN.multiply(mN.add(1)).divide2()).subtract(3);
  }
}
