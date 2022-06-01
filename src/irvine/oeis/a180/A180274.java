package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180274 Integers whose squares are the sums of 24 consecutive squares.
 * @author Sean A. Irvine
 */
public class A180274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180274() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0}, new long[] {70, 106, 158, 182, 274, 430, 650, 1022, 1546, 1786, 2702, 4250});
  }
}
