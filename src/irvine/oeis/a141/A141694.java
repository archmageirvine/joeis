package irvine.oeis.a141;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A141694 a(n) = 22*n + 12.
 * @author Georg Fischer
 */
public class A141694 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A141694() {
    super(0, "[0, 1,-2, 1]", "[12, 34]", 0);
  }
}
