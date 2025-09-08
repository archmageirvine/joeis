package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080191 Primes p such that p is the largest of all prime factors of the numbers between the prime preceding 2*p and the next prime.
 * @author Sean A. Irvine
 */
public class A080191 extends A000040 {

  private boolean is(final Z p, final Z q, final long maxP) {
    boolean saw = false;
    for (Z r = p.add(1); r.compareTo(q) < 0; r = r.add(1)) {
      Z t = r.makeOdd();
      for (long d = 3; d <= maxP; d = mPrime.nextPrime(d)) {
        while (true) {
          final Z[] qr = t.divideAndRemainder(d);
          if (!qr[1].isZero()) {
            break;
          }
          t = qr[0];
          if (d == maxP) {
            saw = true;
          }
        }
      }
      if (!t.isOne()) {
        return false;
      }
    }
    return saw;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p)) {
        return p;
      }
      final Z q = mPrime.prevPrime(p.multiply2());
      if (is(q, mPrime.nextPrime(q), p.longValueExact())) {
        return p;
      }
    }
  }
}

