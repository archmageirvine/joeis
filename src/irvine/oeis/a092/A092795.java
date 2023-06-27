package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092795 Number of connected relations.
 * @author Sean A. Irvine
 */
public class A092795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092795() {
    super(1, new long[] {30240, -20658, 5477, -701, 43}, new long[] {1, 67, 1993, 43891, 836521});
  }
}
