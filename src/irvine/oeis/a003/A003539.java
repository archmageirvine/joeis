package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003539 a(0) = 587, a(n) = 3*a(n-1) + 16 for n &gt; 0 (the first 11 terms are primes).
 * @author Sean A. Irvine
 */
public class A003539 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(587) : mA.multiply(3).add(16);
    return mA;
  }
}
