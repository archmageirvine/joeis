package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101094.
 * @author Sean A. Irvine
 */
public class A101094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101094() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 11, 57, 203, 574, 1386, 2982});
  }
}
