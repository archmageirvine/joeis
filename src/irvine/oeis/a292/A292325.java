package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292325.
 * @author Sean A. Irvine
 */
public class A292325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292325() {
    super(new long[] {-1, 0, 0, 0, -2, 2, 0, 0, -1, 2}, new long[] {2, 3, 4, 5, 8, 13, 20, 29, 40, 56});
  }
}
