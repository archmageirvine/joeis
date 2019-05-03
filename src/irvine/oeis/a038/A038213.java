package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038213 Top line of 3-wave sequence <code>A038196</code>, also bisection of <code>A006356</code>.
 * @author Sean A. Irvine
 */
public class A038213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038213() {
    super(new long[] {1, -5, 6}, new long[] {1, 3, 14});
  }
}
