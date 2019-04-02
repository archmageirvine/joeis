package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291233 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A291233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291233() {
    super(new long[] {1, 1, -4, -1, 4, 1}, new long[] {1, 2, 5, 11, 26, 58});
  }
}
