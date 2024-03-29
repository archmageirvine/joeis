package irvine.oeis.a070;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A070533 a(n) = n^4 mod 15.
 * @author Georg Fischer
 */
public class A070533 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A070533() {
    super(0, "[[0],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1]]", "[0, 1, 1, 6, 1, 10, 6, 1, 1, 6, 10, 1, 6, 1, 1, 0]", 15);
  }
}
