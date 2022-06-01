package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130424 Main diagonal of array A[k,n] = n-th sum of k consecutive k-gonal numbers, k&gt;2.
 * @author Sean A. Irvine
 */
public class A130424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130424() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4, 30, 125, 365, 854});
  }
}
