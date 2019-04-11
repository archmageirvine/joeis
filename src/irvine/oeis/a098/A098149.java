package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098149 <code>a(0)=-1, a(1)=-1, a(n)=-3*a(n-1)-a(n-2)</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A098149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098149() {
    super(new long[] {-1, -3}, new long[] {-1, -1});
  }
}
