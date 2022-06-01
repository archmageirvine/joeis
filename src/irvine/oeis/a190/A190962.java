package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190962 a(n) = 3*a(n-1) - 8*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190962() {
    super(new long[] {-8, 3}, new long[] {0, 1});
  }
}
