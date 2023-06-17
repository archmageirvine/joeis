package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291011 p-INVERT of (1,1,1,1,1,...), where p(S) = (1 - S)^2 * (1 - 2*S).
 * @author Sean A. Irvine
 */
public class A291011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291011() {
    super(new long[] {12, -16, 7}, new long[] {4, 15, 52});
  }
}
