package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099322.
 * @author Sean A. Irvine
 */
public class A099322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099322() {
    super(new long[] {8, -16, 1, 7}, new long[] {0, 1, 6, 43});
  }
}
