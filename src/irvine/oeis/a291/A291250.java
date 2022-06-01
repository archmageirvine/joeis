package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291250 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S - 2 S^2 + 2 S^3.
 * @author Sean A. Irvine
 */
public class A291250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291250() {
    super(new long[] {1, 1, -5, -4, 5, 1}, new long[] {1, 3, 4, 13, 17, 52});
  }
}
