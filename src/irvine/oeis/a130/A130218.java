package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130218 Partial sums of A100119. Sum of first n of the n-th centered n-gonal numbers.
 * @author Sean A. Irvine
 */
public class A130218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130218() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 10, 29, 70});
  }
}
