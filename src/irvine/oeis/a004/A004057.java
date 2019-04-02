package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004057 Expansion of (1-x)/( (1+x)*(1-2*x)*(1-3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A004057 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, -1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -8, 17, 2, -24);

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
