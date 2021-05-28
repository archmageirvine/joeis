package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a020.A020481;

/**
 * A047949 a(n) is the largest m such that n-m and n+m are both primes, or -1 if no such m exists.
 * @author Sean A. Irvine
 */
public class A047949 extends A020481 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(super.next());
  }
}
