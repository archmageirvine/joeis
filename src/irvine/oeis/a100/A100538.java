package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100538 Volume of the 3-dimensional box of sides of length equal to consecutive Padovan numbers (A000931). These boxes form a spiral in three dimensions similar to the spiral of Fibonacci boxes in two dimensions.
 * @author Sean A. Irvine
 */
public class A100538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100538() {
    super(new long[] {-1, 0, -1, -1, -4, 4, -2, 3, 2, 1}, new long[] {1, 2, 4, 12, 24, 60, 140, 315, 756, 1728});
  }
}
