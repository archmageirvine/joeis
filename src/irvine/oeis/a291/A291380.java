package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291380 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S^5.
 * @author Sean A. Irvine
 */
public class A291380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291380() {
    super(new long[] {1, 5, 10, 10, 5, 1, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 1, 5, 10, 10, 5, 2});
  }
}
