package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111733 <code>a(n) = a(n-1) + a(n-2) + 7</code> where <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A111733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111733() {
    super(new long[] {-1, 0, 2}, new long[] {1, 1, 9});
  }
}
