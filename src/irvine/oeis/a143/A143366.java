package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A143366 Wiener index of the hexagon crown (beehive model) with n hexagons on each side of the outside ring.
 * @author Georg Fischer
 */
public class A143366 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143366() {
    super(1, new long[] {0, 27, 840, 2202, 840, 27},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
