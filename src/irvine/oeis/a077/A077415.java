package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077415 a(n) = n*(n+2)*(n-2)/3.
 * @author Sean A. Irvine
 */
public class A077415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077415() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 16, 35});
  }
}
