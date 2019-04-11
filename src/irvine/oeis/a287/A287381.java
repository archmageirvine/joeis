package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287381 <code>a(n) = a(n-1) + 2*a(n-2) - a(n-3),</code> where <code>a(0) = 2, a(1) = 4, a(2) = 7</code>.
 * @author Sean A. Irvine
 */
public class A287381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287381() {
    super(new long[] {-1, 2, 1}, new long[] {2, 4, 7});
  }
}
