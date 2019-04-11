package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001570 Numbers k such that <code>k^2</code> is centered hexagonal.
 * @author Sean A. Irvine
 */
public class A001570 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -14, 1);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, -1);
  private int mN = 0;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
