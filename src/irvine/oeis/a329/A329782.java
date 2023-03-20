package irvine.oeis.a329;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329782 Numbers that are congruent to {+-1, +-4, +-5, +-6, +-7, +-9, +-10, +-11, +-13, +-15, +-16, +-19} (mod 40).
 * @author Georg Fischer
 */
public class A329782 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329782() {
    super(1, "[0,-1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,-1]",
      "1,4,5,6,7,9,10,11,13,15,16,19,21,24,25,27,29,30,31,33,34,35,36,39,41,44", 0);
  }
}
