package irvine.oeis.a188;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.IntegerField;

/**
 * A188491 Number of permutations p on the set <code>[n]</code> with the properties that abs(p(i)-i) <code>&lt;= 3</code> for all i, p(1) <code>&lt;= 3,</code> and p(4) <code>&gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A188491 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 1, 1, -1, -3, -3, -1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -3, -3, -13, -21, -19, -3, 7, 9, 5, 3, 3, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
