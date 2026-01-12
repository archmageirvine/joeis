package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391804 a(n) = least prime greater than prime(n)*prime(n+1).
 * @author Sean A. Irvine
 */
public class A391804 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p.multiply(mPrime.nextPrime(p)));
  }
}

