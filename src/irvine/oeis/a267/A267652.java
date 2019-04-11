package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267652 <code>a(n) = 4*a(n - 1) + 4*a(n - 2)</code> for <code>n&gt;1, a(0)=2, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A267652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267652() {
    super(new long[] {4, 4}, new long[] {2, 3});
  }
}
