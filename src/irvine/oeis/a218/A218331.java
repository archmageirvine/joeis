package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218331 Even, nonzero decagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A218331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218331() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {38, 90, 476, 708, 1826, 2366, 4600});
  }
}
