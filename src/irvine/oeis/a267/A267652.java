package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267652 a(n) = 4*a(n - 1) + 4*a(n - 2) for n&gt;1, a(0)=2, a(1)=3.
 * @author Sean A. Irvine
 */
public class A267652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267652() {
    super(new long[] {4, 4}, new long[] {2, 3});
  }
}
