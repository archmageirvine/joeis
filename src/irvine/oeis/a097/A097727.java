package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097727 Pell equation solutions (5*b(n))^2 <code>- 26*a(n)^2 = -1</code> with b(n):=A097726(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097727() {
    super(new long[] {-1, 102}, new long[] {1, 101});
  }
}
