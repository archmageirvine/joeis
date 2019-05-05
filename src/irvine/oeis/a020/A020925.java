package irvine.oeis.a020;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020925.
 * @author Sean A. Irvine
 */
public class A020925 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.pow(RING.create(Arrays.asList(Q.ONE, new Q(-4))), 13);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.sqrt(C, ++mN).coeff(mN).toZ();
  }
}
