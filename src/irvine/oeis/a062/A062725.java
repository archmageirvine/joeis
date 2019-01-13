package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062725.
 * @author Sean A. Irvine
 */
public class A062725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062725() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 23});
  }
}
