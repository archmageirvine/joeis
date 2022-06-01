package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291730 p-INVERT of (1,0,1,0,0,0,0,...), where p(S) = 1 - 2 S - 2 S^2.
 * @author Sean A. Irvine
 */
public class A291730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291730() {
    super(new long[] {2, 0, 4, 2, 2, 2}, new long[] {2, 6, 18, 56, 168, 510});
  }
}
