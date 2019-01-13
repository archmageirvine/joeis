package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153795.
 * @author Sean A. Irvine
 */
public class A153795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153795() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 40});
  }
}
