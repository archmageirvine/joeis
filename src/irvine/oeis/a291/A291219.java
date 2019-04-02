package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291219 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S - S^3.
 * @author Sean A. Irvine
 */
public class A291219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291219() {
    super(new long[] {1, 1, -3, -1, 3, 1}, new long[] {1, 1, 3, 5, 11, 21});
  }
}
