package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099583.
 * @author Sean A. Irvine
 */
public class A099583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099583() {
    super(new long[] {-9, -6, 6, 2}, new long[] {0, 0, 1, 2});
  }
}
