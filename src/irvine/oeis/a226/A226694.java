package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226694 Pell equation solutions <code>(32*a(n))^2 - 41*(5*b(n))^2 = -1</code> with <code>b(n) </code>:= A226695(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A226694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226694() {
    super(new long[] {-1, 4098}, new long[] {1, 4099});
  }
}
