package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098181 Two consecutive odd numbers separated by multiples of four, repeated twice, between them, written in increasing order.
 * @author Sean A. Irvine
 */
public class A098181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098181() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 3, 4, 4});
  }
}
