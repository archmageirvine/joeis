package irvine.oeis.a077;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A077877 Expansion of (1-x)^(-1)/(1-x+2*x^2+x^3).
 * @author Georg Fischer
 */
public class A077877 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A077877() {
    super(0, "[0,-1,-1, 3,-2, 1]", "[1, 2, 1,-3]", 0);
  }
}
