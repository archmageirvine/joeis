package irvine.oeis.a109;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A109362 Period 6: repeat [0, 0, 1, 2, 0, 3].
 * @author Georg Fischer
 */
public class A109362 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A109362() {
    super(0, "[0,-1, 0, 0, 0, 0, 0, 1]", "[0, 0, 1, 2, 0, 3]", 0);
  }
}
