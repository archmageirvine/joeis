package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069962.
 * @author Sean A. Irvine
 */
public class A069962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069962() {
    super(new long[] {-1, 2, 2}, new long[] {1, 26, 29});
  }
}
