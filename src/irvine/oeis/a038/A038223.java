package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038223 Bottom line of 3-wave sequence <code>A038196</code>, also bisection of <code>A006356</code>.
 * @author Sean A. Irvine
 */
public class A038223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038223() {
    super(new long[] {1, -5, 6}, new long[] {1, 6, 31});
  }
}
