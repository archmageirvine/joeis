package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-02/insect2 at 2024-04-02 23:05

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;

/**
 * A070188 Primes p such that x^12 = 2 has a solution mod p, but x^(12^2) = 2 has no solution mod p.
 * @author Georg Fischer
 */
public class A070188 extends IntersectionSequence {

  /** Construct the sequence. */
  public A070188() {
    super(new A040028(12, 2, true), new A040028(144, 2, false));
  }
}
