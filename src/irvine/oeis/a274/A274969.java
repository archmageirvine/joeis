package irvine.oeis.a274;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A274969 Number of walks in the first quadrant starting and ending at (0,0) consisting of 3n steps taken from {E=(1, 0), D=(-1, 1), S=(0, -1)}, no S step occurring before the final E step.
 * @author Georg Fischer
 */
public class A274969 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A274969() {
    super(0, "[[0],[-12, 48,-33, 0,-27],[4, 10, 4, 2, 4]]", "[1, 1]", 0);
  }
}
