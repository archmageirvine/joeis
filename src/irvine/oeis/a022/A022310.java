package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022310 <code>a(n) = a(n-1) + a(n-2) + 1</code> for <code>n&gt;1, a(0)=0, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A022310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022310() {
    super(new long[] {-1, 0, 2}, new long[] {0, 5, 6});
  }
}
