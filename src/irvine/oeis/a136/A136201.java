package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136201.
 * @author Sean A. Irvine
 */
public class A136201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136201() {
    super(new long[] {-3, -6, 4, 2}, new long[] {0, 0, 0, 1});
  }
}
