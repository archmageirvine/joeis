package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031217 Number of terms in longest arithmetic progression of consecutive primes starting at n-th prime (conjectured to be unbounded).
 * @author Sean A. Irvine
 */
public class A031217 extends A000040 {

  @Override
  public Z next() {
    final Z s = super.next();
    Z t = mFast.nextPrime(s);
    final Z d = t.subtract(s);
    long c = 1;
    while (true) {
      ++c;
      final Z u = mFast.nextPrime(t);
      if (!u.subtract(t).equals(d)) {
        break;
      }
      t = u;
    }
    return Z.valueOf(c);
  }
}
