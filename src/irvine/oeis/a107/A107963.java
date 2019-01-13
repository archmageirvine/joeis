package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107963.
 * @author Sean A. Irvine
 */
public class A107963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107963() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 13, 73, 273, 798, 1974, 4326});
  }
}
