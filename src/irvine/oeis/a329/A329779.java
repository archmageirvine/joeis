package irvine.oeis.a329;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329779 Numbers that are either odd or are congruent to {+-4, +-6, +-8, +-10} (mod 32).
 * @author Georg Fischer
 */
public class A329779 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329779() {
    super(1, "[0,-1,2,-1,0,0,0,0,0,-1,2,-1,0,0,0,0,0,-1,2,-1]",
      "[1,3,4,5,6,7,8,9,10,11,13,15,17,19,21,22,23,24]", 0);
  }
}
