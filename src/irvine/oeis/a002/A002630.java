package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002630 Number of permutations of length n with two 3-sequences.
 * @author Sean A. Irvine
 */
public class A002630 implements Sequence {

  // After Tani Akinari

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM0 = RING.pow(RING.oneMinusXToTheN(1), 4).shift(6);
  private static final Polynomial<Q> DEN0 = RING.pow(RING.oneMinusXToTheN(3), 4);
  private static final Polynomial<Q> NUM1 = RING.multiply(RING.pow(RING.oneMinusXToTheN(1), 3), RING.onePlusXToTheN(1).shift(4));
  private static final Polynomial<Q> DEN1 = RING.pow(RING.oneMinusXToTheN(3), 3);
  private static final Polynomial<Q> NUM2 = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.ZERO, Q.NEG_ONE));
  private static final Polynomial<Q> DEN2 = RING.oneMinusXToTheN(3);

  private int mN = 0;
  private final MemoryFactorial mF = new MemoryFactorial();

  private Polynomial<Q> poly(final int m, final int n) {
    final Polynomial<Q> c1 = RING.series(NUM0, DEN0, n);
    final Polynomial<Q> c2 = RING.series(NUM1, DEN1, n);
    final Polynomial<Q> c3 = RING.pow(RING.series(NUM2, DEN2, n), m, n);
    return RING.multiply(RING.add(RING.multiply(c1, new Q(mF.factorial(m + 2).multiply(m + 1).multiply(m + 2), Z.TWO)),
        RING.multiply(c2, new Q(mF.factorial(m + 1)).multiply(m + 1))), c3, n);
  }

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ZERO;
    }
    Polynomial<Q> sum = RING.zero();
    for (int m = 0; m <= mN; ++m) {
      sum = RING.add(sum, poly(m, mN));
    }
    return sum.coeff(mN).toZ();
  }
}
