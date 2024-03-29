package irvine.oeis.a076;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A076683 Numbers k such that 7*k! + 1 is prime.
 * @author Georg Fischer
 */
public class A076683 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A076683() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[-1]]", "7", 0), k -> k.add(1)), 0);
  }
}
