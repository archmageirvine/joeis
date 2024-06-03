package irvine.oeis.a070;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;

/**
 * A070185 Primes p such that x^9 = 2 has a solution mod p, but x^(9^2) = 2 has no solution mod p.
 * @author Sean A. Irvine
 */
public class A070185 extends IntersectionSequence {

  /** Construct the sequence. */
  public A070185() {
    super(new A040028(9, 2, true), new A040028(81, 2, false));
  }
}
