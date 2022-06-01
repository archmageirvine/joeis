package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217274 a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3) with a(0)=0, a(1)=1, a(2)=7.
 * @author Sean A. Irvine
 */
public class A217274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217274() {
    super(new long[] {7, -14, 7}, new long[] {0, 1, 7});
  }
}
