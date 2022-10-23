package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002421 Expansion of (1-4*x)^(3/2) in powers of x.
 * @author Sean A. Irvine
 */
public class A002421 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> POLY = RING.create(Arrays.asList(Q.ZERO, new Q(-12), new Q(48), new Q(-64)));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.sqrt1p(POLY, mN).coeff(mN).toZ();
  }
}
