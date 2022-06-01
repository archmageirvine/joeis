package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260304 a(n) = 5*a(n-1) - 5*a(n-2) for n&gt;1, a(0)=2, a(1)=3.
 * @author Sean A. Irvine
 */
public class A260304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260304() {
    super(new long[] {-5, 5}, new long[] {2, 3});
  }
}
