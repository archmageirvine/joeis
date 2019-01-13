package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069008.
 * @author Sean A. Irvine
 */
public class A069008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069008() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 4, 18, 74, 309, 1280});
  }
}
