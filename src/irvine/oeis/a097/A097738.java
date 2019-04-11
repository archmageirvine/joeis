package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097738 Pell equation solutions <code>(9*a(n))^2 -</code> 82*b(n)^2 <code>= -1</code> with b(n):=A097739(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097738() {
    super(new long[] {-1, 326}, new long[] {1, 327});
  }
}
