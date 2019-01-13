package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024143.
 * @author Sean A. Irvine
 */
public class A024143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024143() {
    super(new long[] {12, -49, 76, -54, 16}, new long[] {1, 11, 136, 1701, 20672});
  }
}
