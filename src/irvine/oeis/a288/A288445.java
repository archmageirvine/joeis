package irvine.oeis.a288;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.SimpleTransformSequence;


/**
 * A288445 Numbers k such that k!6 + 18 is prime, where k!6 is the sextuple factorial number (A085158 ).
 * @author Georg Fischer
 */
public class A288445 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A288445() {
    super(new SimpleTransformSequence(new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5", 0), k -> k.add(18)), 0);
    next();
  }
}
