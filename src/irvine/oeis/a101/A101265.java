package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101265 <code>a(1) = 1, a(2) = 2, a(3) = 6; a(n) = 5*a(n-1) - 5*a(n-2) + a(n-3)</code> for <code>n&gt;3</code>.
 * @author Sean A. Irvine
 */
public class A101265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101265() {
    super(new long[] {1, -5, 5}, new long[] {1, 2, 6});
  }
}
