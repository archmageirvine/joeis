package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104584 (1/2) * ( 3*n^2 + n*(-1)^n ).
 * @author Sean A. Irvine
 */
public class A104584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104584() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 7, 12, 26});
  }
}
