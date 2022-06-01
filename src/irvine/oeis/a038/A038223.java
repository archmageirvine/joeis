package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038223 Bottom line of 3-wave sequence A038196, also bisection of A006356.
 * @author Sean A. Irvine
 */
public class A038223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038223() {
    super(new long[] {1, -5, 6}, new long[] {1, 6, 31});
  }
}
