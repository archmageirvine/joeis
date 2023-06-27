package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048903 Heptagonal hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A048903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048903() {
    super(1, new long[] {1, -103683, 103683}, new long[] {1, 121771, 12625478965L});
  }
}
