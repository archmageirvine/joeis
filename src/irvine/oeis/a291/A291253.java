package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291253 p-INVERT of (0,1,0,1,0,1,...), where p(S) = (1 - S - S^2)^2.
 * @author Sean A. Irvine
 */
public class A291253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291253() {
    super(new long[] {-1, -2, 5, 8, -9, -8, 5, 2}, new long[] {2, 5, 12, 30, 70, 166, 382, 881});
  }
}
