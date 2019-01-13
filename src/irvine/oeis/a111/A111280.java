package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111280.
 * @author Sean A. Irvine
 */
public class A111280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111280() {
    super(new long[] {-1, 0, 4, -2, 4}, new long[] {1, 2, 6, 22, 113});
  }
}
