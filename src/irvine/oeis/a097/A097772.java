package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097772 Pell equation solutions <code>(13*a(n))^2 -</code> 170*b(n)^2 <code>= -1</code> with b(n):=A097771(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097772() {
    super(new long[] {-1, 678}, new long[] {1, 679});
  }
}
