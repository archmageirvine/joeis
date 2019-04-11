package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097735 Pell equation solutions <code>(8*a(n))^2 -</code> 65*b(n)^2 <code>= -1</code> with b(n):=A097736(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097735() {
    super(new long[] {-1, 258}, new long[] {1, 259});
  }
}
