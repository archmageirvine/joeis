package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117950.
 * @author Sean A. Irvine
 */
public class A117950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117950() {
    super(new long[] {1, -3, 3}, new long[] {3, 4, 7});
  }
}
