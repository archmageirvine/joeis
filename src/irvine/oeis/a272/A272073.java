package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272073 Exponents of x in the numerator of cluster variables of a rank 2 cluster algebra.
 * @author Sean A. Irvine
 */
public class A272073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272073() {
    super(2, new long[] {-1, 0, 4, 0}, new long[] {0, 3, 6, 15});
  }
}
