package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190972 a(n) = 7*a(n-1) - 3*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190972() {
    super(new long[] {-3, 7}, new long[] {0, 1});
  }
}
