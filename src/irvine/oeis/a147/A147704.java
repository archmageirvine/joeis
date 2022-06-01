package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147704 Diagonal sums of Riordan array ((1-2x)/(1 - 3x + x^2),x(1-x)/(1 - 3x + x^2)).
 * @author Sean A. Irvine
 */
public class A147704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147704() {
    super(new long[] {-1, 0, 3}, new long[] {1, 1, 3});
  }
}
