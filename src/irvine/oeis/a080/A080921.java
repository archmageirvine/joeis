package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080921 a(n) = 2*a(n-1) + 48*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A080921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080921() {
    super(new long[] {48, 2}, new long[] {0, 1});
  }
}
