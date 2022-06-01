package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292535 p-INVERT of the squares (A000290), where p(S) = 1 + S - 2 S^2.
 * @author Sean A. Irvine
 */
public class A292535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292535() {
    super(new long[] {-1, 5, -11, 24, -15, 7}, new long[] {1, 7, 38, 189, 909, 4368});
  }
}
