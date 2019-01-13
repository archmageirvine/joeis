package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099623.
 * @author Sean A. Irvine
 */
public class A099623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099623() {
    super(new long[] {12, -4, -9, 6}, new long[] {0, 0, 1, 6});
  }
}
