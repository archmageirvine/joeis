package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042917.
 * @author Sean A. Irvine
 */
public class A042917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042917() {
    super(new long[] {-1, 0, 0, 0, 1762, 0, 0, 0}, new long[] {1, 2, 13, 28, 1749, 3526, 22905, 49336});
  }
}
