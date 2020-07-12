package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033274 Primes that do not contain any other prime as a proper substring.
 * @author Sean A. Irvine
 */
public class A033274 extends A000040 {

  private boolean isNoPrimeContained(final Z p) {
    final String s = p.toString();
    Z q = Z.ONE;
    while ((q = mFast.nextPrime(q)).compareTo(p) < 0) {
      if (s.contains(q.toString())) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(Z.SEVEN) <= 0) {
        return p;
      }
      if (isNoPrimeContained(p)) {
        return p;
      }
    }
  }
}
