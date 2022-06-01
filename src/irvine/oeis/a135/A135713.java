package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135713 a(n) = n*(n+1)*(4*n+1)/2.
 * @author Sean A. Irvine
 */
public class A135713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135713() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 27, 78});
  }
}
