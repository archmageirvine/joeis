package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157371.
 * @author Sean A. Irvine
 */
public class A157371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157371() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {9, 8, 9, 0, -55});
  }
}
