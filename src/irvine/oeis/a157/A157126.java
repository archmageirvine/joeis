package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157126.
 * @author Sean A. Irvine
 */
public class A157126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157126() {
    super(new long[] {-1, 0, 0, -4, 0, 0}, new long[] {1, -2, -3, -3, 8, 11});
  }
}
