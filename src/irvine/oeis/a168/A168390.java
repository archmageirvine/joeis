package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168390 a(n) = 1 + 8*floor(n/2).
 * @author Sean A. Irvine
 */
public class A168390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168390() {
    super(new long[] {-1, 1, 1}, new long[] {1, 9, 9});
  }
}
