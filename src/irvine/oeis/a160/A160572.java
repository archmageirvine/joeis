package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160572 Elements of <code>A160444</code>, pairs of consecutive entries swapped.
 * @author Sean A. Irvine
 */
public class A160572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160572() {
    super(new long[] {2, 0, 2, 0}, new long[] {1, 0, 1, 1});
  }
}
