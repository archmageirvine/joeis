package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094686 A Fibonacci convolution.
 * @author Sean A. Irvine
 */
public class A094686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094686() {
    super(new long[] {1, 2, 1, 0}, new long[] {1, 0, 1, 2});
  }
}
