package irvine.oeis.a053;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053091 F^3-convex polyominoes on the honeycomb lattice by number of cells.
 * @author Sean A. Irvine
 */
public class A053091 extends Sequence1 {

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int i = 1; i <= mN; ++i) {
      final Z[] sc = new Z[mN - i + 1];
      Arrays.fill(sc, Z.ZERO);
      for (int k = 1; k <= i; ++k) {
        final int u = (i - k) * (i + k - 1) / 2;
        if (u < sc.length) {
          sc[u] = sc[u].add(1);
        }
      }
      final Polynomial<Z> s = RING.pow(Polynomial.create(sc), 2, mN - i);
      final Polynomial<Z> a = RING.series(RING.onePlusXToTheN(i).shift(i), RING.oneMinusXToTheN(i), mN);
      sum = RING.add(sum, RING.multiply(a, s, mN));
    }
    return sum.coeff(mN);
  }
}
