package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175110 a(n) = ((2*n+1)^4+1)/2.
 * @author Sean A. Irvine
 */
public class A175110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175110() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 41, 313, 1201, 3281});
  }
}
