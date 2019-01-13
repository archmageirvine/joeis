package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291411.
 * @author Sean A. Irvine
 */
public class A291411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291411() {
    super(new long[] {-1, -3, -2, 1, 3, 2}, new long[] {2, 7, 21, 63, 189, 567});
  }
}
