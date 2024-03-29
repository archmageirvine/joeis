package irvine.oeis.a336;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A336625 Indices of triangular numbers that are eight times other triangular numbers.
 * @author Georg Fischer
 */
public class A336625 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A336625() {
    super(1, "[[0],[1],[-1],[-34],[34],[1],[-1]]", "[0, 15, 32, 527, 1104]", 0);
  }
}
