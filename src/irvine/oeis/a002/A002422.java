package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Rationals;
import irvine.math.q.Q;

import java.util.Arrays;

/**
 * A002422 Expansion of (1-4*x)^(5/2).
 * @author Sean A. Irvine
 */
public class A002422 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> POLY = RING.create(Arrays.asList(Q.ZERO, new Q(-20), new Q(160), new Q(-640), new Q(1280), new Q(-1024)));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.sqrt1p(POLY, mN).coeff(mN).toZ();
  }
}
