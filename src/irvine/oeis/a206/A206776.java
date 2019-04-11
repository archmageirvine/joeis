package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206776 <code>a(n) = 3*a(n-1) + 2*a(n-2)</code> for <code>n&gt;1, a(0)=2, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A206776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206776() {
    super(new long[] {2, 3}, new long[] {2, 3});
  }
}
