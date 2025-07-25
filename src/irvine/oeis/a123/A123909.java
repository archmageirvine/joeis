package irvine.oeis.a123;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A123909 Primes of the form k!+11.
 * @author Georg Fischer
 */
public class A123909 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A123909() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[-1]]", "1", 0), k -> k.add(11)), 0);
  }
}
