package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079343 Period 6: repeat [0, 1, 1, 2, 3, 1]; also F(n) mod 4, where F(n) = A000045(n).
 * @author Sean A. Irvine
 */
public class A079343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079343() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 2, 3});
  }
}
