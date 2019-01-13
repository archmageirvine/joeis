package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128091.
 * @author Sean A. Irvine
 */
public class A128091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128091() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 45, 160, 425});
  }
}
