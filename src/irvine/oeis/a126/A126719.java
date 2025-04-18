package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126719 a(n) = -n^2 + 9*n + 23.
 * @author Sean A. Irvine
 */
public class A126719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126719() {
    super(new long[] {1, -3, 3}, new long[] {23, 31, 37});
  }
}
