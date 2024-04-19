package irvine.oeis.a034;

import java.util.Collections;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a008.A008295;

/**
 * A034800 Triangle of number of node labeled trees by number of nodes and number of labels.
 * @author Sean A. Irvine
 */
public class A034800 extends A008295 {

  private static final Polynomial<Q> HALF = RING_Y.create(Collections.singletonList(Q.HALF));
  protected Polynomial<Polynomial<Q>> mT = RING_X.zero();
  {
    setOffset(1);
    ++mN;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      updateR();
      mT = RING_X.add(RING_X.subtract(mRR, RING_X.multiply(RING_X.pow(mRR, 2), HALF)), RING_X.multiply(mR.substitutePower(2), HALF));
    }
    return mT.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mM)).toZ();
  }
}

