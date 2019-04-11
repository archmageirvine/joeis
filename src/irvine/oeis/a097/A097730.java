package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097730 Pell equation solutions <code>(6*b(n))^2 - 37*a(n)^2 = -1</code> with <code>b(n)</code>:=A097729(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097730() {
    super(new long[] {-1, 146}, new long[] {1, 145});
  }
}
