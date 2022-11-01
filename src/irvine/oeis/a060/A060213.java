package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060213 Lesser of twin primes whose average is 6 times a prime.
 * @author Sean A. Irvine
 */
public class A060213 extends A060212 {

  @Override
  public Z next() {
    return super.next().multiply(6).subtract(1);
  }
}

