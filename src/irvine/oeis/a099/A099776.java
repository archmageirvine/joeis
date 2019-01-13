package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099776.
 * @author Sean A. Irvine
 */
public class A099776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099776() {
    super(new long[] {1, -3, 3}, new long[] {5, 13, 25});
  }
}
