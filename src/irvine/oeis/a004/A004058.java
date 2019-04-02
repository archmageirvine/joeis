package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004058 Expansion of (1-x)/( (1+x)*(1-2*x)*(1-3*x)*(1-4*x)*(1-5*x)).
 * @author Sean A. Irvine
 */
public class A004058 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, -1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -13, 57, -83, -34, 120);

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
