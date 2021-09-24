package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051702 Distance from n-th prime to closest prime.
 * @author Sean A. Irvine
 */
public class A051702 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z prev = mPrime.prevPrime(p);
    final Z next = mPrime.nextPrime(p);
    return prev.signum() <= 0 ? next.subtract(p) : p.subtract(prev).min(next.subtract(p));
  }
}
