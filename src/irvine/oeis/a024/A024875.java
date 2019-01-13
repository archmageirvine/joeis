package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024875.
 * @author Sean A. Irvine
 */
public class A024875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024875() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {12, 15, 38, 45, 82, 94, 148});
  }
}
