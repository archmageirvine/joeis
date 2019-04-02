package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195312 Multiples of 9 and odd numbers interleaved.
 * @author Sean A. Irvine
 */
public class A195312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195312() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 9, 3});
  }
}
