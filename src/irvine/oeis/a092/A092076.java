package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092076.
 * @author Sean A. Irvine
 */
public class A092076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092076() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 1, 1, 7, 7, 7, 19});
  }
}
