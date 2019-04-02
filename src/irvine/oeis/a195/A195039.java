package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195039 23 times triangular numbers.
 * @author Sean A. Irvine
 */
public class A195039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195039() {
    super(new long[] {1, -3, 3}, new long[] {0, 23, 69});
  }
}
