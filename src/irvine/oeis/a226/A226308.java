package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226308 a(n) = a(n-1) + a(n-2) + 2*a(n-3) with a(0)=2, a(1)=1, a(2)=5.
 * @author Sean A. Irvine
 */
public class A226308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226308() {
    super(new long[] {2, 1, 1}, new long[] {2, 1, 5});
  }
}
