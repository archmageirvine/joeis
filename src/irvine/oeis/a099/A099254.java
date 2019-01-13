package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099254.
 * @author Sean A. Irvine
 */
public class A099254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099254() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 2, 1, -2});
  }
}
