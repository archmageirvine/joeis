package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291417 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - 4 S + 2 S^2.
 * @author Sean A. Irvine
 */
public class A291417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291417() {
    super(new long[] {-2, -4, 2, 4}, new long[] {4, 18, 76, 322});
  }
}
