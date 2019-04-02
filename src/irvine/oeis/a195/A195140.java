package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195140 Multiples of 5 and odd numbers interleaved.
 * @author Sean A. Irvine
 */
public class A195140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195140() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 5, 3});
  }
}
