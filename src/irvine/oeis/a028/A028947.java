package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028947 Difference between <code>P(n)</code> and nearest integer to <code>P(n-1)^2 / P(n-2)</code>, where <code>P(i) =i-th</code> prime.
 * @author Sean A. Irvine
 */
public class A028947 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z p = mA;
    mA = mB;
    mB = super.next();
    return mB.subtract(new Q(mA.square(), p).add(Q.HALF).toZ());
  }
}

