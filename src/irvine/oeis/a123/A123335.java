package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123335 <code>a(n) = -2*a(n-1) + a(n-2)</code> for <code>n&gt;1, a(0)=1, a(1)=-1</code>.
 * @author Sean A. Irvine
 */
public class A123335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123335() {
    super(new long[] {1, -2}, new long[] {1, -1});
  }
}
