package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100334 An inverse Catalan transform of F(2n).
 * @author Sean A. Irvine
 */
public class A100334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100334() {
    super(new long[] {-1, 2, -4, 3}, new long[] {0, 1, 2, 2});
  }
}
