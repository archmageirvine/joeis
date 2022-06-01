package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045883 a(n) = ((3*n+1)*2^n - (-1)^n)/9.
 * @author Sean A. Irvine
 */
public class A045883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045883() {
    super(new long[] {-4, 0, 3}, new long[] {0, 1, 3});
  }
}
