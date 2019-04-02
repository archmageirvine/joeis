package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097139 Convolution of 5^n and floor(n/2).
 * @author Sean A. Irvine
 */
public class A097139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097139() {
    super(new long[] {5, -6, -4, 6}, new long[] {0, 0, 1, 6});
  }
}
