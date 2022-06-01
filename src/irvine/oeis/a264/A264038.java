package irvine.oeis.a264;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A264038 Convolution of Lucas and Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A264038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264038() {
    super(new long[] {-2, -3, 2, 2}, new long[] {0, 2, 3, 10});
  }
}
