package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157441.
 * @author Sean A. Irvine
 */
public class A157441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157441() {
    super(new long[] {-1, 2}, new long[] {209, 1540});
  }
}
