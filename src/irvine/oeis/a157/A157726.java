package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157726.
 * @author Sean A. Irvine
 */
public class A157726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157726() {
    super(new long[] {-1, 0, 2}, new long[] {3, 4, 4});
  }
}
