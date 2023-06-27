package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157820 27225n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A157820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157820() {
    super(1, new long[] {1, -3, 3}, new long[] {27227, 108904, 245031});
  }
}
