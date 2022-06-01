package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155120 a(n) = 2*(n^3 + n^2 + n - 1).
 * @author Sean A. Irvine
 */
public class A155120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155120() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-2, 4, 26, 76});
  }
}
