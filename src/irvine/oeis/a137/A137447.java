package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137447 <code>a(n) = 4*a(n-4)</code> for <code>n&gt;3, a(0)=-1, a(1)=-4, a(2)=2, a(3)=12</code>.
 * @author Sean A. Irvine
 */
public class A137447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137447() {
    super(new long[] {4, 0, 0, 0}, new long[] {-1, -4, 2, 12});
  }
}
