package irvine.oeis.a167;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A167421 2^n mod 22.
 * @author Georg Fischer
 */
public class A167421 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167421() {
    super(0, "[0,-1, 1, 0, 0, 0,-1, 1]", "[1, 2, 4, 8, 16, 10, 20]", 0);
  }
}
