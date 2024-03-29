package irvine.oeis.a265;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A265200 Numbers n such that n!3 + 3^7 is prime, where n!3 = n!!! is a triple factorial number (A007661).
 * @author Georg Fischer
 */
public class A265200 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A265200() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[-1]]", "1, 1, 2", 0), k -> k.add(2187)), 0);
  }
}
