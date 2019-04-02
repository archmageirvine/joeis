package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099484 A Fibonacci convolution.
 * @author Sean A. Irvine
 */
public class A099484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099484() {
    super(new long[] {-1, 3, -2, 3}, new long[] {1, 1, 2, 7});
  }
}
