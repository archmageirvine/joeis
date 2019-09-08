package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101604 <code>a(n) = 2*a(n-1) + 5*a(n-2) + 2*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A101604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101604() {
    super(new long[] {2, 5, 2}, new long[] {1, 2, 9});
  }
}
