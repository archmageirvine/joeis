package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267027.
 * @author Sean A. Irvine
 */
public class A267027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267027() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 4, 5, 7, 9, 10});
  }
}
