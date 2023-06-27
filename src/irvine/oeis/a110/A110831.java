package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110831 a(n) = 3*n^2 + 27*n + 1.
 * @author Sean A. Irvine
 */
public class A110831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110831() {
    super(1, new long[] {1, -3, 3}, new long[] {31, 67, 109});
  }
}
