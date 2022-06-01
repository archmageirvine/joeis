package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144721 a(0) = 2, a(1) = 5, a(n) = 4 * a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A144721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144721() {
    super(new long[] {-1, 4}, new long[] {2, 5});
  }
}
