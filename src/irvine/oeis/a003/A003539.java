package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003539 a(n)=3*a(n-1)+16 (the first 11 terms are primes).
 * @author Sean A. Irvine
 */
public class A003539 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(587) : mA.multiply(3).add(16);
    return mA;
  }
}
