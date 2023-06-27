package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106256 Numbers n such that 12*n^2 + 13 is a square.
 * @author Sean A. Irvine
 */
public class A106256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106256() {
    super(1, new long[] {-1, 0, 14, 0}, new long[] {1, 3, 17, 43});
  }
}
