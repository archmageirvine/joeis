package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016028 Expansion of (1 - x + x^4) / (1 - x)^3.
 * @author Sean A. Irvine
 */
public class A016028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016028() {
    super(1, new long[] {1, -3, 3}, new long[] {3, 4, 6}, 1L, 2L);
  }
}
