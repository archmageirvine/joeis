package irvine.oeis.a209;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A209410 Number of subsets of {1,...,n} not containing {a,a+2,a+4} for any a.
 * @author Sean A. Irvine
 */
public class A209410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209410() {
    super(new long[] {-1, -1, 0, 2, 2, 0, 2, 0, 1}, new long[] {1, 2, 4, 8, 16, 28, 49, 91, 169});
  }
}
