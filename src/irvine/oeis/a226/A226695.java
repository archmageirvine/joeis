package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226695 Pell equation solutions (32*b(n))^2 - 41*(5*a(n))^2 = -1 with b(n) := A226694(n), n&gt;=0.
 * @author Sean A. Irvine
 */
public class A226695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226695() {
    super(new long[] {-1, 4098}, new long[] {1, 4097});
  }
}
