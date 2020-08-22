package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195018 a(n) = n*(10*n-3).
 * @author Sean A. Irvine
 */
public class A195018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195018() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 34});
  }
}
