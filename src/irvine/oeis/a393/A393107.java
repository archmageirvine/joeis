package irvine.oeis.a393;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000960;

/**
 * A393107 Primes in the Flavius Josephus's Sieve sequence (A000960).
 * @author Sean A. Irvine
 */
public class A393107 extends FilterSequence {

  /** Construct the sequence. */
  public A393107() {
    super(1, new A000960(), PRIME);
  }
}
