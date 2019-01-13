package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244631.
 * @author Sean A. Irvine
 */
public class A244631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244631() {
    super(new long[] {1, -3, 3}, new long[] {0, 19, 76});
  }
}
