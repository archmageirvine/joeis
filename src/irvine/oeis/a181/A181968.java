package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181968 54n^3 - 1.
 * @author Sean A. Irvine
 */
public class A181968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181968() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {53, 431, 1457, 3455});
  }
}
