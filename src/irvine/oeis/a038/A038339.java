package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038339 Bottom line of 5-wave sequence <code>A038201</code>, also bisection of <code>A006358</code>.
 * @author Sean A. Irvine
 */
public class A038339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038339() {
    super(new long[] {1, -9, 28, -35, 15}, new long[] {1, 15, 190, 2353, 29056});
  }
}
