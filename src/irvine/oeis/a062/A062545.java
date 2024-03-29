package irvine.oeis.a062;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A062545 Continued fraction for the 2nd du Bois-Reymond constant.
 * @author Georg Fischer
 */
public class A062545 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A062545() {
    super(0, "[0, 1,-2, 1]", "[0, 5, 7]", 0);
  }
}
