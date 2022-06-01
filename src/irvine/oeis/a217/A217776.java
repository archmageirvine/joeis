package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217776 a(n) = n*(n+1) + (n+2)*(n+3) + (n+4)*(n+5) + (n+6)*(n+7).
 * @author Sean A. Irvine
 */
public class A217776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217776() {
    super(new long[] {1, -3, 3}, new long[] {68, 100, 140});
  }
}
