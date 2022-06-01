package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157324 a(n) = 36*n^2 + n.
 * @author Sean A. Irvine
 */
public class A157324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157324() {
    super(new long[] {1, -3, 3}, new long[] {37, 146, 327});
  }
}
