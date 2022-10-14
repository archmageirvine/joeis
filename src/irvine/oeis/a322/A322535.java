package irvine.oeis.a322;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A322535 Number of arrays of 8 integers in -n..n with sum zero.
 * @author Georg Fischer
 */
public class A322535 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322535() {
    super(0, "[0,1,-8,28,-56,70,-56,28,-8,1]", "1,1107,38165,398567,2306025,9377467,30162301,82073295", 0);
  }
}
