package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100242.
 * @author Sean A. Irvine
 */
public class A100242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100242() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 26, 207, 904, 2825});
  }
}
