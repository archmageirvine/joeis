package irvine.oeis.a016;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004013;

/**
 * A016725 Number of integer solutions to x^2+y^2+z^2 = n^2, allowing zeros and distinguishing signs and order.
 * @author Sean A. Irvine
 */
public class A016725 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int s = mN * mN;
    final Polynomial<Z> phi = A004013.phi(s);
    final Polynomial<Z> p = RING.pow(phi, 3, s);
    return p.coeff(s);
  }
}
