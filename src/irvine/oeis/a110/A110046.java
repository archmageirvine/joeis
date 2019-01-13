package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110046.
 * @author Sean A. Irvine
 */
public class A110046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110046() {
    super(new long[] {-16, -16, 8, 4}, new long[] {1, 8, 28, 144});
  }
}
