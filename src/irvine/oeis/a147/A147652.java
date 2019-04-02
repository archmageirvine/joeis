package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147652 Expansion of 1/(1 - x^4 - x^5 - x^6 + x^10).
 * @author Sean A. Irvine
 */
public class A147652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147652() {
    super(new long[] {-1, 0, 0, 0, 1, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 1, 0, 1, 2});
  }
}
