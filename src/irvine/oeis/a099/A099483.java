package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099483.
 * @author Sean A. Irvine
 */
public class A099483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099483() {
    super(new long[] {-1, 3, -2, 3}, new long[] {0, 1, 3, 7});
  }
}
