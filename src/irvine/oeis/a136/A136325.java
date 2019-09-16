package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136325 Non-negative integers x such that <code>3(5x^2+3)</code> is a perfect square.
 * @author Sean A. Irvine
 */
public class A136325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136325() {
    super(new long[] {-1, 8}, new long[] {0, 3});
  }
}
