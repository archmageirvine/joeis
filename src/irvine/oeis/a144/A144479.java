package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144479 a(0)=1, a(1)=3, a(n) = 8*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A144479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144479() {
    super(new long[] {-1, 8}, new long[] {1, 3});
  }
}
