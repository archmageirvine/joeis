package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291241 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S - S^2 + S^3.
 * @author Sean A. Irvine
 */
public class A291241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291241() {
    super(new long[] {1, 1, -4, -3, 4, 1}, new long[] {1, 2, 3, 7, 10, 22});
  }
}
