package irvine.oeis.a002;

import irvine.math.z.Z;

import irvine.oeis.a001.A001511;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;

/**
 * A002425.
 * @author Sean A. Irvine
 */
public class A002425 extends A001511 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mB.next(); // skip odd terms
    final Q b = mB.next();
    mA = mA.multiply(4);
    return b.multiply(Z.ONE.subtract(mA)).divide(mN).multiply(Z.ONE.shiftLeft(super.next().intValueExact())).toZ().abs();
  }
}
