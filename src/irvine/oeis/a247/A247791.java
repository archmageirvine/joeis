package irvine.oeis.a247;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A247791 Primes p such that there is a prime q for which sigma(sigma(2*q-1)) = p.
 *
 * @author Georg Fischer
 */
public class A247791 extends BriefSequence {

  /** Construct the sequence. */
  public A247791() {
    super(1, BRIEF, Z.SEVEN, new Z("131071"), new Z("524287"));
  }
}
