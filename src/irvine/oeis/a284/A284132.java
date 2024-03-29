package irvine.oeis.a284;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A284132 Numbers k such that k![12]-2 is prime, where k![12] is the twelve-fold multifactorial.
 * @author Georg Fischer
 */
public class A284132 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A284132() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11", 0), k -> k.subtract(2)), 0);
  }
}
