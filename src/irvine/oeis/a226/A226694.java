package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226694 Pell equation solutions (32*a(n))^2 - 41*(5*b(n))^2 = -1 with b(n) := A226695(n), n&gt;=0.
 * @author Sean A. Irvine
 */
public class A226694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226694() {
    super(new long[] {-1, 4098}, new long[] {1, 4099});
  }
}
