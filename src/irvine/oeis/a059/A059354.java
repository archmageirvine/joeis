package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;
import irvine.oeis.a049.A049596;

/**
 * A059354 Primes p such that x^27 = 2 has no solution mod p, but x^9 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059354 extends IntersectionSequence {

  private static final class MySequence extends A040028 {
    private MySequence() {
      super(27, 2, false);
    }
  }

  /** Construct the sequence. */
  public A059354() {
    super(new A049596(), new MySequence());
  }
}
