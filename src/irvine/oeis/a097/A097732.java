package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097732 Pell equation solutions <code>(7*a(n))^2 -</code> 2*(5*b(n))^2 <code>= -1</code> with b(n):=A097733(n), <code>n&gt;=0</code>. Note that D=50=2*5^2 is not squarefree.
 * @author Sean A. Irvine
 */
public class A097732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097732() {
    super(new long[] {-1, 198}, new long[] {1, 199});
  }
}
