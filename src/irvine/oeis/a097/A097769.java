package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097769 Pell equation solutions <code>(12*a(n))^2 -</code> 145*b(n)^2 <code>= -1</code> with b(n):=A097770(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097769() {
    super(new long[] {-1, 578}, new long[] {1, 579});
  }
}
