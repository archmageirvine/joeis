package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;
import irvine.oeis.a042.A042966;

/**
 * A059667 Primes p such that x^49 = 2 has no solution mod p, but x^7 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059667 extends IntersectionSequence {

  /** Construct the sequence. */
  public A059667() {
    super(new A042966(), new A040028(49, 2, false));
  }
}
