package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097776 Pell equation solutions <code>(14*b(n))^2 - 197*a(n)^2 = -1</code> with <code>b(n)</code>:=A097775(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097776() {
    super(new long[] {-1, 786}, new long[] {1, 785});
  }
}
