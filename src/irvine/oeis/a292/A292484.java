package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292484 p-INVERT of the odd positive integers, where p(S) = 1 + S - S^2.
 * @author Sean A. Irvine
 */
public class A292484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292484() {
    super(new long[] {-1, 7, -4, 3}, new long[] {-1, -1, 4, 9});
  }
}
