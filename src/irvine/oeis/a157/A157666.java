package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157666 a(n) = 19683*n - 13716.
 * @author Sean A. Irvine
 */
public class A157666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157666() {
    super(1, new long[] {-1, 2}, new long[] {5967, 25650});
  }
}
