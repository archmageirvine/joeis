package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071730 Smallest prime p &gt; prime(n) such that p-prime(n) is a square.
 * @author Sean A. Irvine
 */
public class A071730 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      if (Predicates.SQUARE.is(q.subtract(p))) {
        return q;
      }
    }
  }
}
