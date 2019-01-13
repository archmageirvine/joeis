package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092439.
 * @author Sean A. Irvine
 */
public class A092439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092439() {
    super(new long[] {-12, 40, -39, -9, 42, -30, 9}, new long[] {0, 0, 6, 30, 140, 560, 2058});
  }
}
