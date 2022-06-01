package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123197 (2*n+1)*(n+1)*(2*n^2+3*n-1).
 * @author Sean A. Irvine
 */
public class A123197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123197() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, 24, 195, 728, 1935});
  }
}
