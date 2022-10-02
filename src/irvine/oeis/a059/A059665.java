package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;
import irvine.oeis.a040.A040992;

/**
 * A059665 Primes p such that x^54 = 2 has no solution mod p, but x^6 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059665 extends IntersectionSequence {

  /** Construct the sequence. */
  public A059665() {
    super(new A040992(), new A040028(54, 2, false));
  }
}
