package irvine.oeis.a051;

import java.util.Arrays;
import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051550 Numerators in expansion of 1/(10+sqrt(36+x)).
 * @author Sean A. Irvine
 */
public class A051550 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C0 = RING.create(Arrays.asList(Q.ONE, new Q(1, 36)));
  private static final Polynomial<Q> C1 = RING.create(Collections.singletonList(new Q(10)));
  private static final Q SIX = new Q(6);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(RING.coeff(RING.one(), RING.add(C1, RING.multiply(RING.sqrt(C0, ++mN), SIX)), mN));
  }
}
