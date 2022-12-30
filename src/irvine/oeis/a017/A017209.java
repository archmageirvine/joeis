package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017209 a(n) = 9*n + 4.
 * @author Sean A. Irvine
 */
public class A017209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017209() {
    super(new long[] {-1, 2}, new long[] {4, 13});
  }
}
