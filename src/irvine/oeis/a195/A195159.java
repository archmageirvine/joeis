package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195159 Multiples of 7 and odd numbers interleaved.
 * @author Sean A. Irvine
 */
public class A195159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195159() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 7, 3});
  }
}
