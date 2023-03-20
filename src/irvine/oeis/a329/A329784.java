package irvine.oeis.a329;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329784 Numbers that are either +-1 (mod 5) or +-22 (mod 55).
 * @author Georg Fischer
 */
public class A329784 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329784() {
    super(1, "[0,-1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,-1]",
      "1,4,6,9,11,14,16,19,21,22,24,26,29,31,33,34,36,39,41,44,46,49,51,54,56", 0);
  }
}
