package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027626.
 * @author Sean A. Irvine
 */
public class A027626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027626() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 2, 10, 5, 7, 28, 12, 15, 55});
  }
}
