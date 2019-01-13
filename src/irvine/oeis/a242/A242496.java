package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242496.
 * @author Sean A. Irvine
 */
public class A242496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242496() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {0, 1, 7, 23, 72, 204});
  }
}
