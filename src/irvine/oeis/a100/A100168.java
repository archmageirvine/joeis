package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100168 Structured pentagonal icositetrahedral numbers (vertex structure 10).
 * @author Sean A. Irvine
 */
public class A100168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100168() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 38, 174, 472});
  }
}
