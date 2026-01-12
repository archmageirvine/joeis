package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391805 a(n) = greatest prime less than prime(n)*prime(n+1).
 * @author Sean A. Irvine
 */
public class A391805 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.prevPrime(p.multiply(mPrime.nextPrime(p)));
  }
}

