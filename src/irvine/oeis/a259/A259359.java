package irvine.oeis.a259;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A259359 Numbers n such that n!!-8 is prime.
 * @author Georg Fischer
 */
public class A259359 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A259359() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[0],[-1]]", "1, 1", 0), k -> k.subtract(8)), 0);
  }
}
