package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092431 Numbers having in binary representation a leading 1 followed by n zeros and n-1 ones.
 * @author Sean A. Irvine
 */
public class A092431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092431() {
    super(new long[] {8, -14, 7}, new long[] {2, 9, 35});
  }
}
