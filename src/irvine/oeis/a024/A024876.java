package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024876.
 * @author Sean A. Irvine
 */
public class A024876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024876() {
    super(new long[] {-1, -1, -1, 3}, new long[] {3, 7, 15, 31});
  }
}
