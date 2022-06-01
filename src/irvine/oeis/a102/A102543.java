package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102543 Antidiagonal sums of the antidiagonals of Losanitsch's triangle.
 * @author Sean A. Irvine
 */
public class A102543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102543() {
    super(new long[] {-1, 0, -1, 1, -1, 0, 0, 1, 1}, new long[] {1, 1, 1, 2, 2, 3, 4, 6, 8});
  }
}
