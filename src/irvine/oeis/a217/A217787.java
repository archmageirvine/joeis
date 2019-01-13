package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217787.
 * @author Sean A. Irvine
 */
public class A217787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217787() {
    super(new long[] {-1, 0, 0, 5, 0, 0}, new long[] {1, 1, 1, 1, 2, 3});
  }
}
