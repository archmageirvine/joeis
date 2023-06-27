package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128091 Row sums of unsigned A128090.
 * @author Sean A. Irvine
 */
public class A128091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128091() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 45, 160, 425});
  }
}
