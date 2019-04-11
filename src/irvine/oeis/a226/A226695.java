package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226695 Pell equation solutions (32*b(n))^2 <code>- 41*(5*a(n))^2 = -1</code> with b(n) := A226694(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A226695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226695() {
    super(new long[] {-1, 4098}, new long[] {1, 4097});
  }
}
