package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290781 a(n) = 20*n + 15.
 * @author Sean A. Irvine
 */
public class A290781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290781() {
    super(new long[] {-1, 2}, new long[] {15, 35});
  }
}
