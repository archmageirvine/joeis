package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;
import irvine.oeis.a049.A049556;

/**
 * A059669 Primes p such that x^48 = 2 has no solution mod p, but x^24 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059669 extends IntersectionSequence {

  /** Construct the sequence. */
  public A059669() {
    super(new A049556(), new A040028(48, 2, false));
  }
}
