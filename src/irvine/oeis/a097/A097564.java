package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097564 <code>a(0)=0, a(1)=1;</code> for <code>n&gt;1, a(n) = (a(n-1) mod 2)*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A097564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097564() {
    super(new long[] {1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 2, 1, 3});
  }
}
