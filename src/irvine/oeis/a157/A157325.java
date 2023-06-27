package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157325 a(n) = 1728*n + 24.
 * @author Sean A. Irvine
 */
public class A157325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157325() {
    super(1, new long[] {-1, 2}, new long[] {1752, 3480});
  }
}
