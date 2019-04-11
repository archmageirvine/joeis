package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A003232 Expansion of <code>(x-1)*(x^2-4*x-1)/(1-2*x)^2</code>.
 * @author Sean A. Irvine
 */
public class A003232 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Arrays.asList(Q.ONE, Q.THREE, new Q(-5), Q.ONE));
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.ONE, new Q(-4), new Q(4)));

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN).toZ();
  }
}
