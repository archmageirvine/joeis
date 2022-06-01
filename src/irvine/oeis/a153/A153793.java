package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153793 13 times pentagonal numbers: a(n) = 13*n*(3*n-1)/2.
 * @author Sean A. Irvine
 */
public class A153793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153793() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 65});
  }
}
