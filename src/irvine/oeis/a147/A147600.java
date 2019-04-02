package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147600 Expansion of 1/(1 - 3*x^2 + x^4).
 * @author Sean A. Irvine
 */
public class A147600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147600() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 0, 3, 0});
  }
}
