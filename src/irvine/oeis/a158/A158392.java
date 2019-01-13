package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158392.
 * @author Sean A. Irvine
 */
public class A158392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158392() {
    super(new long[] {1, -3, 3}, new long[] {674, 2700, 6078});
  }
}
