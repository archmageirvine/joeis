package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079496.
 * @author Sean A. Irvine
 */
public class A079496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079496() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 1, 3, 5});
  }
}
