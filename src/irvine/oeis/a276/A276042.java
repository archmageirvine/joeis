package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276042 Exponential convolution of central polygonal numbers (A000124) with themselves.
 * @author Sean A. Irvine
 */
public class A276042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276042() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {1, 4, 16, 62, 230});
  }
}
