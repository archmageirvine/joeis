package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023620 Convolution of Lucas numbers and odd numbers.
 * @author Sean A. Irvine
 */
public class A023620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023620() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 6, 18, 41});
  }
}
