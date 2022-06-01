package irvine.oeis.a065;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A065532 a(n) = 48*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A065532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065532() {
    super(new long[] {1, -3, 3}, new long[] {-1, 47, 191});
  }
}
