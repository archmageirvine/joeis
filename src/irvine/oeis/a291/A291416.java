package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291416 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - 4 S + S^2.
 * @author Sean A. Irvine
 */
public class A291416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291416() {
    super(new long[] {-1, -2, 3, 4}, new long[] {4, 19, 86, 392});
  }
}
