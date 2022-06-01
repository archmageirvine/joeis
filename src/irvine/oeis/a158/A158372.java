package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158372 576n - 1.
 * @author Sean A. Irvine
 */
public class A158372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158372() {
    super(new long[] {-1, 2}, new long[] {575, 1151});
  }
}
