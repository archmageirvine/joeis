package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291034 p-INVERT of the positive integers, where p(S) = 1 - 7*S.
 * @author Sean A. Irvine
 */
public class A291034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291034() {
    super(new long[] {-1, 9}, new long[] {7, 63});
  }
}
