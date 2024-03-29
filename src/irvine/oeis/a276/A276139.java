package irvine.oeis.a276;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A276139 Series expansion of (1 + 2x + 4x^2)/(1 - 3x - 5x^2).
 * @author Georg Fischer
 */
public class A276139 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A276139() {
    super(0, "[[0],[-5],[-3],[1]]", "[1, 5, 24]", 0);
  }
}
