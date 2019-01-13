package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069140.
 * @author Sean A. Irvine
 */
public class A069140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069140() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 60, 504, 1716});
  }
}
