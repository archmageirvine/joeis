package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244883.
 * @author Sean A. Irvine
 */
public class A244883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244883() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 14, 100, 472, 1691, 4988, 12744, 29160});
  }
}
