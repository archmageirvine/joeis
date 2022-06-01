package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038261 First line of 5-wave sequence A038201, also bisection of A006358.
 * @author Sean A. Irvine
 */
public class A038261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038261() {
    super(new long[] {1, -9, 28, -35, 15}, new long[] {1, 5, 55, 671, 8272});
  }
}
