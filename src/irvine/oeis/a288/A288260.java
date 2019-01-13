package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288260.
 * @author Sean A. Irvine
 */
public class A288260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288260() {
    super(new long[] {-3, 2, 0, 2}, new long[] {2, 4, 8, 16});
  }
}
