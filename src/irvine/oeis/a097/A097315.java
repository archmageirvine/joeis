package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097315 Pell equation solutions (3*b(n))^2 <code>- 10*a(n)^2 = -1</code> with b(n):=A097314(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097315() {
    super(new long[] {-1, 38}, new long[] {1, 37});
  }
}
