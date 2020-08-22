package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164579 Integer averages of halves of first cubes of natural numbers (n^3)/2 for some n.
 * @author Sean A. Irvine
 */
public class A164579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164579() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {6, 56, 81, 198, 480, 578, 950, 1656, 1875, 2646});
  }
}
