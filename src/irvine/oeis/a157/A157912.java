package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157912 64*n^2 + 16.
 * @author Sean A. Irvine
 */
public class A157912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157912() {
    super(new long[] {1, -3, 3}, new long[] {80, 272, 592});
  }
}
