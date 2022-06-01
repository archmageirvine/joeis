package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216100 11^n mod 100.
 * @author Sean A. Irvine
 */
public class A216100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216100() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 11, 21, 31, 41, 51, 61, 71, 81, 91});
  }
}
