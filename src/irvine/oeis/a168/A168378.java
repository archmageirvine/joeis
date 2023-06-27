package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168378 a(n) = 3 + 8*floor(n/2).
 * @author Sean A. Irvine
 */
public class A168378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168378() {
    super(1, new long[] {-1, 1, 1}, new long[] {3, 11, 11});
  }
}
