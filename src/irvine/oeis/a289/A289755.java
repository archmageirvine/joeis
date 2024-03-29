package irvine.oeis.a289;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A289755 Primes of the form k!9-1, where k!9 is the nonuple factorial number (A114806).
 * @author Georg Fischer
 */
public class A289755 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A289755() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5, 6, 7, 8", 0), k -> k.subtract(1)), 0);
  }
}
