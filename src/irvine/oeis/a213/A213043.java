package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213043 Convolution of <code>(1,-1,2,-2,3,-3,</code>...) and A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A213043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213043() {
    super(new long[] {-1, -2, 1, 3, 0}, new long[] {1, 0, 3, 1, 7});
  }
}
