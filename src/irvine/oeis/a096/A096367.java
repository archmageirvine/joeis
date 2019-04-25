package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096367 Number of winning paths of length <code>n+1</code> across an n X n Hex board.
 * @author Sean A. Irvine
 */
public class A096367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096367() {
    super(new long[] {-8, 20, -18, 7}, new long[] {2, 14, 58, 194});
  }
}
