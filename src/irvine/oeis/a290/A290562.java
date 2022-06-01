package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290562 a(n) = n - cos(n*Pi/2).
 * @author Sean A. Irvine
 */
public class A290562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290562() {
    super(new long[] {-1, 2, -2, 2}, new long[] {-1, 1, 3, 3});
  }
}
