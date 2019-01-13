package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244805.
 * @author Sean A. Irvine
 */
public class A244805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244805() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 55});
  }
}
