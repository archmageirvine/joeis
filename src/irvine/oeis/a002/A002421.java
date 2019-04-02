package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Rationals;
import irvine.math.q.Q;

import java.util.Arrays;

/**
 * A002421 Expansion of (1-4x)^(3/2) in powers of x.
 * @author Sean A. Irvine
 */
public class A002421 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> POLY = RING.create(Arrays.asList(Q.ZERO, new Q(-12), new Q(48), new Q(-64)));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.sqrt1p(POLY, mN).coeff(mN).toZ();
  }
}
