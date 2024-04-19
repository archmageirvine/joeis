package irvine.oeis.a034;

import java.util.Collections;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a008.A008295;

/**
 * A034799 Triangle read by rows: T(n,k) is the number of partially labeled trees with n nodes, k of which are labeled, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A034799 extends A008295 {

  private static final Polynomial<Q> HALF = RING_Y.create(Collections.singletonList(Q.HALF));
  protected Polynomial<Polynomial<Q>> mT = RING_X.zero();

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      updateR();
      mT = RING_X.add(RING_X.subtract(mRR, RING_X.multiply(RING_X.pow(mRR, 2), HALF)), RING_X.multiply(mR.substitutePower(2), HALF));
    }
    return mT.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mM)).toZ();
  }
}

