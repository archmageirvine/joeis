package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157088.
 * @author Sean A. Irvine
 */
public class A157088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157088() {
    super(new long[] {1, -15, 15}, new long[] {0, 21, 312});
  }
}
