package irvine.oeis.a054;

import irvine.oeis.HolonomicRecurrence;

/**
 * A054393 Number of permutations with certain forbidden subsequences.
 * @author Sean A. Irvine
 */
public class A054393 extends HolonomicRecurrence {

  // Conjectural: DO NOT USE THIS TO EXTEND THE SEQUENCE.

  /** Construct the sequence. */
  public A054393() {
    super(0, "[[0],[18,-3],[-135,22],[357,-55],[-156,10],[-126,44],[120,-35],[-33,10],[3,-1]]", "1, 1, 2, 5, 14, 42, 132", 0);
  }
}
