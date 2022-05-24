package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057131 One less than six times product of first n primes of form 6k-1.
 * @author Sean A. Irvine
 */
public class A057131 extends A057130 {

  @Override
  public Z next() {
    return super.next().multiply(6).subtract(1);
  }
}
