package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076430 Sum of squares of numbers that cannot be written as t*p(n) + u*p(n+1) for nonnegative integers t,u, where p(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A076430 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    return p.multiply(q).multiply(p.subtract(1)).multiply(q.subtract(1)).multiply(q.multiply(p).subtract(p).subtract(q)).divide(12);
  }
}

