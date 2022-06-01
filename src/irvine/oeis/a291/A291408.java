package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291408 p-INVERT of (1,1,0,0,0,0,...), where p(S) = (1 - S)(1 - S^2).
 * @author Sean A. Irvine
 */
public class A291408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291408() {
    super(new long[] {-1, -3, -2, 1, 2, 1}, new long[] {1, 3, 6, 11, 21, 39});
  }
}
