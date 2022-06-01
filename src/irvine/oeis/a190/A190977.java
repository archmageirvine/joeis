package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190977 a(n) = 8*a(n-1) - 5*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190977() {
    super(new long[] {-5, 8}, new long[] {0, 1});
  }
}
