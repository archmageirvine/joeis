package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181888 Second column of triangle in A182971.
 * @author Sean A. Irvine
 */
public class A181888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181888() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 9, 64, 259, 784, 1974});
  }
}
