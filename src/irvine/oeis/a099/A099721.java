package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099721.
 * @author Sean A. Irvine
 */
public class A099721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099721() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 20, 63});
  }
}
