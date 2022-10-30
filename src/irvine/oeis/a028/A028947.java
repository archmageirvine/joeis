package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028947 Difference between P(n) and nearest integer to P(n-1)^2 / P(n-2), where P(i) =i-th prime.
 * @author Sean A. Irvine
 */
public class A028947 extends A000040 {

  {
    setOffset(3);
  }

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

