package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164284 a(n) = 15*n-7.
 * @author Sean A. Irvine
 */
public class A164284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164284() {
    super(1, new long[] {-1, 2}, new long[] {8, 23});
  }
}
