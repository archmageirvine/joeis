package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077280 Sum of next a(n) successive primes is a square.
 * @author Sean A. Irvine
 */
public class A077280 extends A000040 {

  @Override
  public Z next() {
    Z sum = super.next();
    long cnt = 1;
    do {
      ++cnt;
      sum = sum.add(super.next());
    } while (!Predicates.SQUARE.is(sum));
    return Z.valueOf(cnt);
  }
}
