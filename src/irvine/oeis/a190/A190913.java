package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190913.
 * @author Sean A. Irvine
 */
public class A190913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190913() {
    super(new long[] {-1, 0, 3, 1, 0}, new long[] {5, 0, 2, 9, 2});
  }
}
