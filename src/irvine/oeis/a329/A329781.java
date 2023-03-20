package irvine.oeis.a329;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329781 Numbers that are congruent to {+-1, +-3, +-4, +-5, +-9, +-10, +-11, +-14, +-15, +-16, +-17, +-19} (mod 40).
 * @author Georg Fischer
 */
public class A329781 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329781() {
    super(1, "[0,-1,2,-2,2,-2,2,-2,2,-2,2,-2,2,-2,2,-2,2,-2,2,-2,2,-2,2,-2,2,-1]",
      "1,3,4,5,9,10,11,14,15,16,17,19,21,23,24,25,26,29,30,31,35,36,37,39", 0);
  }
}
