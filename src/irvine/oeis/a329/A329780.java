package irvine.oeis.a329;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329780 Numbers that are either odd or are congruent to {+-2, +-8, +-12, +-14} (mod 32).
 * @author Georg Fischer
 */
public class A329780 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329780() {
    super(1, "[0,-1,1,0,1,-1,0,-1,1,0,1,-1,0,-1,1,0,1,-1,0,-1,1,0,1,-1]",
      "1,2,3,5,7,8,9,11,12,13,14,15,17,18,19,20,21,23,24,25,27,29,", 0);
  }
}
