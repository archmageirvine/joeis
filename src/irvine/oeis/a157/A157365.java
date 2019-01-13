package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157365.
 * @author Sean A. Irvine
 */
public class A157365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157365() {
    super(new long[] {1, -3, 3}, new long[] {51, 200, 447});
  }
}
