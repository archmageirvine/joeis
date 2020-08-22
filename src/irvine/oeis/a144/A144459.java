package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144459 a(n) = (3*n+1)*(5*n+1).
 * @author Sean A. Irvine
 */
public class A144459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144459() {
    super(new long[] {1, -3, 3}, new long[] {1, 24, 77});
  }
}
