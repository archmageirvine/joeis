package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050989 7-idempotent numbers.
 * @author Sean A. Irvine
 */
public class A050989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050989() {
    super(new long[] {-5764801, 6588344, -3294172, 941192, -168070, 19208, -1372, 56}, new long[] {1, 56, 1764, 41160, 792330, 13311144, 201885684, 2826399576L});
  }
}
