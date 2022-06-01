package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226309 a(n) = a(n-1) + a(n-2) + a(n-3) + 2*a(n-4) with a(0)=2, a(1)=1, a(2)=5, a(3)=10.
 * @author Sean A. Irvine
 */
public class A226309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226309() {
    super(new long[] {2, 1, 1, 1}, new long[] {2, 1, 5, 10});
  }
}
