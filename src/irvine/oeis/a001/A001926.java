package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001926 G.f.: (1+x)^2/[(1-x)^4(1-x-x^2)^3].
 * @author Sean A. Irvine
 */
public class A001926 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 2, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -7, 18, -17, -7, 24, -9, -9, 6, 1, -1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
