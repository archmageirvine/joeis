package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020806 Decimal expansion of 1/7.
 * @author Sean A. Irvine
 */
public class A020806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020806() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 4, 2, 8});
  }
}
