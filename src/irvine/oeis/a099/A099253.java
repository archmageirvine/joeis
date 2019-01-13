package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099253.
 * @author Sean A. Irvine
 */
public class A099253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099253() {
    super(new long[] {1, -7, 21, -35, 35, -21, 8}, new long[] {1, 8, 43, 211, 1030, 5055, 24851});
  }
}
