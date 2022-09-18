package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;
import irvine.oeis.a049.A049544;

/**
 * A059331 Primes p such that x^24 = 2 has no solution mod p, but x^12 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059331 extends IntersectionSequence {

  private static final class MySequence extends A040028 {
    private MySequence() {
      super(24, 2, false);
    }
  }

  /** Construct the sequence. */
  public A059331() {
    super(new A049544(), new MySequence());
  }
}
