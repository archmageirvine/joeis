package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198396 a(n) = 6^n-6*n.
 * @author Sean A. Irvine
 */
public class A198396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198396() {
    super(new long[] {6, -13, 8}, new long[] {1, 0, 24});
  }
}
