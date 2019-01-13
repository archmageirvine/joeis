package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128789.
 * @author Sean A. Irvine
 */
public class A128789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128789() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 2, 32, 216});
  }
}
