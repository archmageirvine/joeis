package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067332 Convolution of Fibonacci F(n+1), n&gt;=0, with F(n+4), n&gt;=0.
 * @author Sean A. Irvine
 */
public class A067332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067332() {
    super(new long[] {-1, -2, 1, 2}, new long[] {3, 8, 19, 40});
  }
}
