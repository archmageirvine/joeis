package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100167 Structured pentagonal icositetrahedral numbers (vertex structure 13).
 * @author Sean A. Irvine
 */
public class A100167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100167() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 38, 171, 460});
  }
}
