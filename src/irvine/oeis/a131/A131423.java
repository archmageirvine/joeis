package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131423 a(n) = n*(n+2)*(2*n-1)/3. Also, row sums of triangle A131422.
 * @author Sean A. Irvine
 */
public class A131423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131423() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 25, 56});
  }
}
