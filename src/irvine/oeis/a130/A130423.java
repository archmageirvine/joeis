package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130423 Main diagonal of array A[k,n] = n-th sum of 3 consecutive k-gonal numbers, <code>k&gt;2</code>.
 * @author Sean A. Irvine
 */
public class A130423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130423() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 14, 39, 88});
  }
}
