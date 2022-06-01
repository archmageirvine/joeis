package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099846 An Alexander sequence for the knot 8_5.
 * @author Sean A. Irvine
 */
public class A099846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099846() {
    super(new long[] {-1, 3, -4, 5, -4, 3}, new long[] {1, 3, 5, 8, 15, 29});
  }
}
