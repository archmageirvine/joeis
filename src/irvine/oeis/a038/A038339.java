package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038339 Bottom line of 5-wave sequence A038201, also bisection of A006358.
 * @author Sean A. Irvine
 */
public class A038339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038339() {
    super(new long[] {1, -9, 28, -35, 15}, new long[] {1, 15, 190, 2353, 29056});
  }
}
