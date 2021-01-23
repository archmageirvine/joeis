package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247620 Start with a single hexagon; at n-th generation add a hexagon at each expandable vertex; a(n) is the sum of all label values at n-th generation. (See comment for construction rules.).
 * @author Sean A. Irvine
 */
public class A247620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247620() {
    super(new long[] {2, -5, 4}, new long[] {1, 7, 25});
  }
}
