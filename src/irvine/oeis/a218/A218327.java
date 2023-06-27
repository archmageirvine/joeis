package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218327 Even octagonal pyramidal numbers (A002414).
 * @author Sean A. Irvine
 */
public class A218327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218327() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {30, 70, 364, 540, 1386, 1794, 3480});
  }
}
