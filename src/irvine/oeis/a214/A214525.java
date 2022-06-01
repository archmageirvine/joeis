package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214525 a(n) = 7*a(n-1) - 23*a(n-2) + 49*a(n-3) - 49*a(n-4) with a(0)=0, a(1)=1, a(2)=7, a(3)=19.
 * @author Sean A. Irvine
 */
public class A214525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214525() {
    super(new long[] {-49, 49, -23, 7}, new long[] {0, 1, 7, 19});
  }
}
