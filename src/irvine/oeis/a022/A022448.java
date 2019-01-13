package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022448.
 * @author Sean A. Irvine
 */
public class A022448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022448() {
    super(new long[] {-360, 522, -185, 24}, new long[] {1, 24, 391, 5466});
  }
}
