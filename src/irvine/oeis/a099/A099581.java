package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099581.
 * @author Sean A. Irvine
 */
public class A099581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099581() {
    super(new long[] {-9, -9, 6, 3}, new long[] {0, 0, 1, 3});
  }
}
