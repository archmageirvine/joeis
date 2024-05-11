package irvine.oeis.a062;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062888 Smallest palindromic multiple of n-th prime.
 * @author Sean A. Irvine
 */
public class A062888 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    while (!Predicates.PALINDROME.is(10, q)) {
      q = q.add(p);
    }
    return q;
  }
}

