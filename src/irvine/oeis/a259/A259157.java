package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259157 Positive triangular numbers (A000217) that are hexagonal numbers (A000384) divided by 2.
 * @author Sean A. Irvine
 */
public class A259157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259157() {
    super(1, new long[] {1, -1155, 1155}, new long[] {3, 3570, 4119885});
  }
}
