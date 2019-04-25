package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100334 An inverse Catalan transform of <code>F(2n)</code>.
 * @author Sean A. Irvine
 */
public class A100334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100334() {
    super(new long[] {-1, 2, -4, 3}, new long[] {0, 1, 2, 2});
  }
}
