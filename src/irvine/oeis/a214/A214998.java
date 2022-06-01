package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214998 Power ceiling-floor sequence of 2 + sqrt(3).
 * @author Sean A. Irvine
 */
public class A214998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214998() {
    super(new long[] {-1, 3, 3}, new long[] {4, 14, 53});
  }
}
