package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097733 Pell equation solutions <code>(7*b(n))^2 - 2*(5*a(n))^2 = -1</code> with <code>b(n)</code>:=A097732(n), <code>n&gt;=0.</code> Note that D=50=2*5^2 is not squarefree.
 * @author Sean A. Irvine
 */
public class A097733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097733() {
    super(new long[] {-1, 198}, new long[] {1, 197});
  }
}
