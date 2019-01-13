package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045801.
 * @author Sean A. Irvine
 */
public class A045801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045801() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {11, 39, 73, 77, 111});
  }
}
