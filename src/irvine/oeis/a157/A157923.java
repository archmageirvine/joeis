package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157923 a(n) = 49*n^2 - n.
 * @author Sean A. Irvine
 */
public class A157923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157923() {
    super(new long[] {1, -3, 3}, new long[] {48, 194, 438});
  }
}
