package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099526.
 * @author Sean A. Irvine
 */
public class A099526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099526() {
    super(new long[] {3, 0, 0, 2}, new long[] {1, 2, 4, 8});
  }
}
