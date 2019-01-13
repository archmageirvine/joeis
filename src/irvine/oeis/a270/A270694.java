package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270694.
 * @author Sean A. Irvine
 */
public class A270694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270694() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 8, -23, 51});
  }
}
