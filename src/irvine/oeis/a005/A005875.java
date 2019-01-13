package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004013;

/**
 * A005875.
 * @author Sean A. Irvine
 */
public class A005875 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> phi = A004013.phi(mN);
    final Polynomial<Z> p = RING.pow(phi, 3, mN);
    return p.coeff(mN);
  }
}
