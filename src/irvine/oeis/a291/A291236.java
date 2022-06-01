package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291236 p-INVERT of (0,1,0,1,0,1,...), where p(S) = (1 - S)(1 - 3 S).
 * @author Sean A. Irvine
 */
public class A291236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291236() {
    super(new long[] {-1, -4, -1, 4}, new long[] {4, 13, 44, 147});
  }
}
