package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154293.
 * @author Sean A. Irvine
 */
public class A154293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154293() {
    super(new long[] {1, -3, 5, -7, 7, -5, 3}, new long[] {0, 1, 6, 11, 13, 20, 35});
  }
}
