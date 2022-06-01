package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267318 Continued fraction expansion of e^(1/5).
 * @author Sean A. Irvine
 */
public class A267318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267318() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 4, 1, 1, 14, 1});
  }
}
