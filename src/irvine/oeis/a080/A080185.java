package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080185 Primes p such that 5 is the largest of all prime factors of the numbers between p and the next prime (cf. A052248).
 * @author Sean A. Irvine
 */
public class A080185 extends A000040 {

  private final long mMaxP;

  protected A080185(final long maxP) {
    mMaxP = maxP;
  }

  /** Construct the sequence. */
  public A080185() {
    this(5);
  }

  private boolean is(final Z p, final Z q) {
    boolean saw = false;
    for (Z r = p.add(1); r.compareTo(q) < 0; r = r.add(1)) {
      Z t = r.makeOdd();
      for (long d = 3; d <= mMaxP; d = mPrime.nextPrime(d)) {
        while (true) {
          final Z[] qr = t.divideAndRemainder(d);
          if (!qr[1].isZero()) {
            break;
          }
          t = qr[0];
          if (d == mMaxP) {
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
      final Z q = mPrime.nextPrime(p);
      if (is(p, q)) {
        return p;
      }
    }
  }
}

