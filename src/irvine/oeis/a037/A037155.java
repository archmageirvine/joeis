package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A037155 a(n) = n!-p, where p is the largest prime &lt; (n!-1).
 * @author Sean A. Irvine
 */
public class A037155 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    super.next(); // skip 0!
    super.next(); // skip 1!
    super.next(); // skip 2!
  }

  @Override
  public Z next() {
    final Z f = super.next();
    final Z p = mPrime.prevPrime(f.subtract(1));
    return f.subtract(p);
  }
}
