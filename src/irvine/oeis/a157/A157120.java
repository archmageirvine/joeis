package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157120.
 * @author Sean A. Irvine
 */
public class A157120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157120() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {73, 103, 205, 233, 515, 1157});
  }
}
