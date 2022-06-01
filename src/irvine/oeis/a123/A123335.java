package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123335 a(n) = -2*a(n-1) + a(n-2) for n&gt;1, a(0)=1, a(1)=-1.
 * @author Sean A. Irvine
 */
public class A123335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123335() {
    super(new long[] {1, -2}, new long[] {1, -1});
  }
}
