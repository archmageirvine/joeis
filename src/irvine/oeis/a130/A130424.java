package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130424 Main diagonal of array <code>A[k,n] = n-th</code> sum of k consecutive k-gonal numbers, <code>k&gt;2</code>.
 * @author Sean A. Irvine
 */
public class A130424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130424() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4, 30, 125, 365, 854});
  }
}
