package irvine.oeis.a289;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A289820 Primes of the form k!3-243, where k!3 is the triple factorial number (A007661).
 * @author Georg Fischer
 */
public class A289820 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A289820() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[-1]]", "1, 1, 2", 0), k -> k.subtract(243)), 0);
  }
}
