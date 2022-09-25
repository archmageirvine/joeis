package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144065 Values of k such that the expression sqrt(4!*(k+1) + 1) yields an integer.
 * @author Sean A. Irvine
 */
public class A144065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144065() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 6, 11});
  }
}
