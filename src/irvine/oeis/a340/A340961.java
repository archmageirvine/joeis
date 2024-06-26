package irvine.oeis.a340;
// Generated by gen_seq4.pl 2024-04-29/ordsum at 2024-04-29 22:09

import irvine.oeis.a010.A010051;
import irvine.oeis.transform.RootSequence;

/**
 * A340961 Number of ways to write n as an ordered sum of 5 primes.
 * @author Georg Fischer
 */
public class A340961 extends RootSequence {

  /** Construct the sequence. */
  public A340961() {
    super(10, new A010051().skip(2), 5, 1);
  }
}
