package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097729 Pell equation solutions <code>(6*a(n))^2 -</code> 37*b(n)^2 <code>= -1</code> with b(n):=A097730(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097729() {
    super(new long[] {-1, 146}, new long[] {1, 147});
  }
}
