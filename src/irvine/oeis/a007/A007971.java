package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007971.
 * @author Sean A. Irvine
 */
public class A007971 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.TWO, Q.THREE));
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return RING.sqrt1m(C, mN).coeff(mN).toZ().negate();
  }
}
