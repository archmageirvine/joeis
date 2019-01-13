package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262997.
 * @author Sean A. Irvine
 */
public class A262997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262997() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 5, 19, 40, 69});
  }
}
