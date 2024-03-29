package irvine.oeis.a163;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A163812 Expansion of (1 - x^5) * (1 - x^6) / ((1 - x) * (1 - x^10)) in powers of x.
 * @author Georg Fischer
 */
public class A163812 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A163812() {
    super(0, "[0, 1,-1, 1,-1, 1]", "[1, 1, 1, 1, 1]", 0);
  }
}
