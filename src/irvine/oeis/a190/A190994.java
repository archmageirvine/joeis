package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190994 a(n) = a(n-1) + a(n-2), for n&gt;=2, with a(0)=27, a(1)=2.
 * @author Sean A. Irvine
 */
public class A190994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190994() {
    super(new long[] {1, 1}, new long[] {27, 2});
  }
}
