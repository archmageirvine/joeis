package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168458 a(n) = 7 + 10*floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A168458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168458() {
    super(1, new long[] {-1, 1, 1}, new long[] {7, 7, 17});
  }
}
