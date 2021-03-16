package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045626.
 * @author Sean A. Irvine
 */
public class A045626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045626() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {-1, 2, 3, 3, 5});
  }
}
