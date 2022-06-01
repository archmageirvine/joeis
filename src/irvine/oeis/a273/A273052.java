package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273052 Numbers n such that 7*n^2 + 8 is a square.
 * @author Sean A. Irvine
 */
public class A273052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273052() {
    super(new long[] {-1, 16}, new long[] {2, 34});
  }
}
