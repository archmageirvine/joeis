package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291000 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - S - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A291000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291000() {
    super(new long[] {2, -4, 4}, new long[] {1, 3, 9});
  }
}
