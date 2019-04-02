package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004018 Theta series of square lattice (or number of ways of writing n as a sum of 2 squares).
 * @author Sean A. Irvine
 */
public class A004018 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> a = ThetaFunctions.theta3z(++mN);
    return RING.multiply(a, a, mN).coeff(mN);
  }
}
