package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144720 a(0) = 2, a(1) = 3, a(n) = 4 * a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A144720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144720() {
    super(new long[] {-1, 4}, new long[] {2, 3});
  }
}
