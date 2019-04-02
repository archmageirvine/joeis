package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067334 Convolution of Fibonacci F(n+1), n&gt;=0, with F(n+6), n&gt;=0.
 * @author Sean A. Irvine
 */
public class A067334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067334() {
    super(new long[] {-1, -2, 1, 2}, new long[] {8, 21, 50, 105});
  }
}
