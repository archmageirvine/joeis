package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099429 A Jacobsthal-Lucas convolution.
 * @author Sean A. Irvine
 */
public class A099429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099429() {
    super(new long[] {-4, -4, 3, 2}, new long[] {0, 0, 2, 3});
  }
}
