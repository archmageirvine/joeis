package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075440 Numerator of 1/pp(n) - 1/pp(n+1), where pp(n) = n-th prime power.
 * @author Sean A. Irvine
 */
public class A075440 extends A001597 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return new Q(1, t).subtract(new Q(1, mA)).num();
  }
}
