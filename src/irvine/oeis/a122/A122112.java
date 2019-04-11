package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122112 <code>a(0)=1, a(1)=-2, a(n)=4*a(n-2)-a(n-1)</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A122112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122112() {
    super(new long[] {4, -1}, new long[] {1, -2});
  }
}
