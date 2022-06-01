package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081681 A sum of decreasing powers.
 * @author Sean A. Irvine
 */
public class A081681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081681() {
    super(new long[] {6720, -5944, 2070, -355, 30}, new long[] {1, 3, 9, 42, 399});
  }
}
