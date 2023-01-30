package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061265 Number of squares between n-th prime and (n+1)st prime.
 * @author Sean A. Irvine
 */
public class A061265 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).sqrt().subtract(p.sqrt());
  }
}
