package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164267 A Fibonacci convolution.
 * @author Sean A. Irvine
 */
public class A164267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164267() {
    super(new long[] {1, -4, 3, 2}, new long[] {0, 1, 2, 7});
  }
}
