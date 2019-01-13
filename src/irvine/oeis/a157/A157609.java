package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157609.
 * @author Sean A. Irvine
 */
public class A157609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157609() {
    super(new long[] {-1, 2}, new long[] {2640, 5302});
  }
}
