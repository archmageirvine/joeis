package irvine.oeis.a038;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A038519 Number of elements of GF(2^n) with trace 0 and subtrace 1.
 * @author Georg Fischer
 */
public class A038519 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A038519() {
    super(0, "[0,-4,-2, 0, 1]", "[1, 0, 1, 3]", 0);
  }
}
