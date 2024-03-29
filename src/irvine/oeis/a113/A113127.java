package irvine.oeis.a113;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A113127 Expansion of (1 + x + x^2 + x^3)/(1-x)^2.
 * @author Georg Fischer
 */
public class A113127 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A113127() {
    super(0, "[0, 1,-2, 1]", "[1, 3, 6, 10]", 0);
  }
}
