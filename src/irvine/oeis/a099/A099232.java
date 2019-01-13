package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099232.
 * @author Sean A. Irvine
 */
public class A099232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099232() {
    super(new long[] {-3, 2, 2}, new long[] {0, 1, 2});
  }
}
