package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Rationals;
import irvine.math.q.Q;

import java.util.Arrays;

/**
 * A002424 Expansion of <code>(1-4*x)^(9/2)</code>.
 * @author Sean A. Irvine
 */
public class A002424 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> POLY = RING.create(Arrays.asList(Q.ZERO, new Q(-36), new Q(576), new Q(-5376), new Q(32256), new Q(-129024), new Q(344064), new Q(-589824), new Q(589824), new Q(-262144)));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.sqrt1p(POLY, mN).coeff(mN).toZ();
  }
}
