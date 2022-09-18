package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;
import irvine.oeis.a045.A045315;

/**
 * A059287 Primes p such that x^16 = 2 has no solution mod p, but x^8 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059287 extends IntersectionSequence {

  private static final class MySequence extends A040028 {
    private MySequence() {
      super(16, 2, false);
    }
  }

  /** Construct the sequence. */
  public A059287() {
    super(new A045315(), new MySequence());
  }
}
