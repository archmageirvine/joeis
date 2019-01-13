package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101676.
 * @author Sean A. Irvine
 */
public class A101676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101676() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 0, -2, -1, 0});
  }
}
