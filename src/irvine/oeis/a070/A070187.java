package irvine.oeis.a070;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;

/**
 * A070187 Primes p such that x^11 = 2 has a solution mod p, but x^(11^2) = 2 has no solution mod p.
 * @author Sean A. Irvine
 */
public class A070187 extends IntersectionSequence {

  /** Construct the sequence. */
  public A070187() {
    super(new A040028(11, 2, true), new A040028(121, 2, false));
  }
}
