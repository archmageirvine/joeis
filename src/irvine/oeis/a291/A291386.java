package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291386.
 * @author Sean A. Irvine
 */
public class A291386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291386() {
    super(new long[] {-9, -18, -3, 6}, new long[] {2, 11, 54, 252});
  }
}
