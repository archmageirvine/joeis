package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099924 Self-convolution of Lucas numbers.
 * @author Sean A. Irvine
 */
public class A099924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099924() {
    super(new long[] {-1, -2, 1, 2}, new long[] {4, 4, 13, 22});
  }
}
