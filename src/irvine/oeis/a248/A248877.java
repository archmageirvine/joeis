package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248877 <code>a(1) = 23, a(2) = 71, a(n) = 3*a(n-1) - 2*a(n-2)</code> for <code>n&gt;2</code>.
 * @author Sean A. Irvine
 */
public class A248877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248877() {
    super(new long[] {-2, 3}, new long[] {23, 71});
  }
}
