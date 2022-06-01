package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212668 a(n) = (16/3)*(n+1)*n*(n-1) + 8*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A212668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212668() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 65, 201, 449});
  }
}
