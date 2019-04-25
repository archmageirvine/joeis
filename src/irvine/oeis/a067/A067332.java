package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067332 Convolution of Fibonacci <code>F(n+1), n&gt;=0,</code> with <code>F(n+4), n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A067332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067332() {
    super(new long[] {-1, -2, 1, 2}, new long[] {3, 8, 19, 40});
  }
}
