package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168374 a(n) = 7 * floor(n/2).
 * @author Sean A. Irvine
 */
public class A168374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168374() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 7, 7});
  }
}
