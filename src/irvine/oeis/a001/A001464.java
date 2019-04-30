package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001464 E.g.f. <code>exp( -x -(1/2)*x^2 )</code>.
 * @author Sean A. Irvine
 */
public class A001464 implements Sequence {

  private long mN = -2;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mB.negate().subtract(mA.multiply(++mN));
    mA = mB;
    mB = t;
    return t;
  }
}
