package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106256 Numbers n such that <code>12*n^2 + 13</code> is a square.
 * @author Sean A. Irvine
 */
public class A106256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106256() {
    super(new long[] {-1, 0, 14, 0}, new long[] {1, 3, 17, 43});
  }
}
