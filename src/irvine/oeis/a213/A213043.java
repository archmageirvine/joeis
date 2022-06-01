package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213043 Convolution of (1,-1,2,-2,3,-3,...) and A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A213043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213043() {
    super(new long[] {-1, -2, 1, 3, 0}, new long[] {1, 0, 3, 1, 7});
  }
}
