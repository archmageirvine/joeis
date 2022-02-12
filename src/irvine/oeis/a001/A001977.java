package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001977 Number of partitions of 3n into n parts from the set {0, 1, ..., 6} (repetitions admissible).
 * @author Sean A. Irvine
 */
public class A001977 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 0, 0, 1, 0, 2, 0, -1, -1, -1, -1, 0, 2, 0, 1, 0, 0, -1, -1, 1);

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= 6; ++k) {
      final long[] c = new long[Math.max(7, mN + 2)];
      c[k] = 1;
      c[mN + 1] += -1;
      p = RING.multiply(p, Polynomial.create(c));
    }
    return RING.coeff(p, DEN, 3 * mN + 3);
  }
}
