package irvine.oeis.a329;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329783 Numbers that are either +-2 (mod 5) or +-11 (mod 55).
 * @author Georg Fischer
 */
public class A329783 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329783() {
    super(1, "[0,-1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,-1]",
      "2,3,7,8,11,12,13,17,18,22,23,27,28,32,33,37,38,42,43,44,47,48,52,53,57", 0);
  }
}
