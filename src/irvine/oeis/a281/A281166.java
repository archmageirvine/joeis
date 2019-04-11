package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281166 <code>a(n) = 3*a(n-1) - 3*a(n-2) + 2*a(n-3)</code> for <code>n&gt;2, a(0)=a(1)=1, a(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A281166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281166() {
    super(new long[] {2, -3, 3}, new long[] {1, 1, 3});
  }
}
