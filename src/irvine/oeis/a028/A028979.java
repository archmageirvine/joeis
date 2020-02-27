package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028979 Palindromes which are the product of two consecutive primes.
 * @author Sean A. Irvine
 */
public class A028979 extends A028888 {

  @Override
  public Z next() {
    return super.next().multiply(mPrev);
  }
}
