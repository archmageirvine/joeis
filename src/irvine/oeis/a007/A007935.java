package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007935.
 * @author Sean A. Irvine
 */
public class A007935 extends A007933 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (!mPrime.isPrime(n)) {
        return n;
      }
    }
  }
}
