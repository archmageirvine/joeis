package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113726 A Jacobsthal convolution.
 * @author Sean A. Irvine
 */
public class A113726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113726() {
    super(new long[] {4, 4, 1, 0}, new long[] {1, 0, 1, 4});
  }
}
