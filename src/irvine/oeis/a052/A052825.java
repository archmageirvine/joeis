package irvine.oeis.a052;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052825 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052825 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X1 = RING.create(Arrays.asList(Q.NEG_ONE, Q.ONE));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> sum = RING.zero();
    for (int j = 1; j <= mN; ++j) {
      sum = RING.add(sum, RING.multiply(RING.log(RING.series(RING.oneMinusXToTheN(j), RING.oneMinusXToTheN(Q.TWO, j), mN), mN), new Q(Functions.PHI.l((long) j), j)));
    }
    return RING.coeff(sum.shift(1), X1, mN).toZ().negate();
  }
}

