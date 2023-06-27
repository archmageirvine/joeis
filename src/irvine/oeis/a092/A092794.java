package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092794 Number of connected relations.
 * @author Sean A. Irvine
 */
public class A092794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092794() {
    super(1, new long[] {160, -92, 17}, new long[] {1, 21, 265});
  }
}
