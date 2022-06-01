package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195817 Multiples of 10 and odd numbers interleaved.
 * @author Sean A. Irvine
 */
public class A195817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195817() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 10, 3});
  }
}
