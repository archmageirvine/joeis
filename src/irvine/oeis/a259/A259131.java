package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259131 Numbers n such that <code>13*n^2 + 52</code> is a square.
 * @author Sean A. Irvine
 */
public class A259131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259131() {
    super(new long[] {-1, 11}, new long[] {3, 36});
  }
}
