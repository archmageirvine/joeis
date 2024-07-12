package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071322 Alternating sum of all prime factors of n; primes nonincreasing, starting with the largest prime factor: A006530(n).
 * @author Sean A. Irvine
 */
public class A071322 extends A071321 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
