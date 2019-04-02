package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099485 A Fibonacci convolution.
 * @author Sean A. Irvine
 */
public class A099485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099485() {
    super(new long[] {-1, 3, -2, 3}, new long[] {1, 2, 5, 14});
  }
}
