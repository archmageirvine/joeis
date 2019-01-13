package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111766.
 * @author Sean A. Irvine
 */
public class A111766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111766() {
    super(new long[] {-1, 5, 5}, new long[] {0, 5, 24});
  }
}
