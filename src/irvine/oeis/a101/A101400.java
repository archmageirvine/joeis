package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101400 <code>a(n) = a(n-1) + 2*a(n-2) + a(n-3) - a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A101400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101400() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 2, 5, 10});
  }
}
