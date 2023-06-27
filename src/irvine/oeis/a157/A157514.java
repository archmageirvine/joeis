package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157514 a(n) = 25*n^2 - n.
 * @author Sean A. Irvine
 */
public class A157514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157514() {
    super(1, new long[] {1, -3, 3}, new long[] {24, 98, 222});
  }
}
