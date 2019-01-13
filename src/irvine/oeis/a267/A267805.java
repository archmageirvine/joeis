package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267805.
 * @author Sean A. Irvine
 */
public class A267805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267805() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 7, 23, 103});
  }
}
