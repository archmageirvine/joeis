package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038213 Top line of 3-wave sequence A038196, also bisection of A006356.
 * @author Sean A. Irvine
 */
public class A038213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038213() {
    super(new long[] {1, -5, 6}, new long[] {1, 3, 14});
  }
}
