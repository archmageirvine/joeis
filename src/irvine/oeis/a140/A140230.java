package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140230 Binomial transform of [1, 2, -3, -4, 5, 6, -7, -8, 9, 10, ...].
 * @author Sean A. Irvine
 */
public class A140230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140230() {
    super(1, new long[] {-4, 8, -8, 4}, new long[] {1, 3, 2, -6});
  }
}
