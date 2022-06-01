package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052226 Partial sums of A050404.
 * @author Sean A. Irvine
 */
public class A052226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052226() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 15, 92, 372, 1170, 3102, 7260, 15444});
  }
}
