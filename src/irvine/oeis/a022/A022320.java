package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022320.
 * @author Sean A. Irvine
 */
public class A022320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022320() {
    super(new long[] {-1, 0, 2}, new long[] {1, 6, 8});
  }
}
