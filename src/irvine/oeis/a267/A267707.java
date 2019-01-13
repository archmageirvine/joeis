package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267707.
 * @author Sean A. Irvine
 */
public class A267707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267707() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 10, 28, 66});
  }
}
