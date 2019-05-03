package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038261 First line of 5-wave sequence <code>A038201</code>, also bisection of <code>A006358</code>.
 * @author Sean A. Irvine
 */
public class A038261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038261() {
    super(new long[] {1, -9, 28, -35, 15}, new long[] {1, 5, 55, 671, 8272});
  }
}
