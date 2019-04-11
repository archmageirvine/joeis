package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097314 Pell equation solutions <code>(3*a(n))^2 - 10*b(n)^2 = -1</code> with <code>b(n) =</code> A097315(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097314() {
    super(new long[] {-1, 38}, new long[] {1, 39});
  }
}
