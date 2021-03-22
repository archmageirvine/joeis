package irvine.oeis.a045;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045853 Number of nonnegative solutions of x1^2 + x2^2 + ... + x12^2 = n.
 * @author Sean A. Irvine
 */
public class A045853 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.pow(RING.add(RING.one(), ThetaFunctions.theta3z(++mN)), 12, mN).coeff(mN).divide(4096);
  }
}
