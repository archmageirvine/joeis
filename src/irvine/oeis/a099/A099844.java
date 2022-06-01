package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099844 An Alexander sequence for the knot 8_2.
 * @author Sean A. Irvine
 */
public class A099844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099844() {
    super(new long[] {-1, 3, -3, 3, -3, 3}, new long[] {1, 3, 6, 12, 24, 48});
  }
}
