package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260304 <code>a(n) = 5*a(n-1) - 5*a(n-2)</code> for <code>n&gt;1, a(0)=2, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A260304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260304() {
    super(new long[] {-5, 5}, new long[] {2, 3});
  }
}
