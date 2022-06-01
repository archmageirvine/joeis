package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033994 a(n) = n*(n+1)*(5*n+1)/6.
 * @author Sean A. Irvine
 */
public class A033994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033994() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 11, 32, 70});
  }
}
