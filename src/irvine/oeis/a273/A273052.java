package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273052 Numbers n such that <code>7*n^2 + 8</code> is a square.
 * @author Sean A. Irvine
 */
public class A273052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273052() {
    super(new long[] {-1, 16}, new long[] {2, 34});
  }
}
