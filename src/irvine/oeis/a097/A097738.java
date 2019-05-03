package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097738 Pell equation solutions <code>(9*a(n))^2 - 82*b(n)^2 = -1</code> with <code>b(n):=A097739(n), n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097738() {
    super(new long[] {-1, 326}, new long[] {1, 327});
  }
}
