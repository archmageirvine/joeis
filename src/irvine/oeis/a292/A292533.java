package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292533 p-INVERT of the squares (A000290), where p(S) = (1 - S)^2.
 * @author Sean A. Irvine
 */
public class A292533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292533() {
    super(new long[] {-1, 4, -12, 18, -20, 8}, new long[] {2, 11, 46, 187, 748, 2948});
  }
}
