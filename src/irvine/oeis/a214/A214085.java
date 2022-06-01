package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214085 n^2 * (n^4 - n^2 + n + 1) / 2.
 * @author Sean A. Irvine
 */
public class A214085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214085() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 30, 342, 1960, 7575, 22806});
  }
}
