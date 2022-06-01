package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256718 a(n) = n*(n+1)*(7*n-6)/2.
 * @author Sean A. Irvine
 */
public class A256718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256718() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 24, 90});
  }
}
