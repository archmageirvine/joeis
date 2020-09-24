package irvine.oeis.a035;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035047 Denominators of alternating sum transform (PSumSIGN) of Harmonic numbers H(n) = A001008/A002805.
 * @author Sean A. Irvine
 */
public class A035047 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.oneMinusXToTheN(1);
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.NEG_ONE, Q.ZERO, Q.ONE)); // x^2-1
  private int mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    return select(RING.coeff(RING.log(NUM, ++mN), DEN, mN));
  }
}
