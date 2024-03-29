package irvine.oeis.a151;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-30 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A151374 Number of walks within N^2 (the first quadrant of Z^2) starting at (0, 0), ending on the vertical axis and consisting of 2n steps taken from {(-1, -1), (-1, 0), (1, 1)}.
 * @author Georg Fischer
 */
public class A151374 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A151374() {
    super(0, "[[0],[4,-8],[1, 1]]", "1, 2", 0);
  }
}
