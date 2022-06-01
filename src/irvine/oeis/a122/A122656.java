package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122656 n*floor(n/2)^2.
 * @author Sean A. Irvine
 */
public class A122656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122656() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 2, 3, 16, 20, 54});
  }
}
