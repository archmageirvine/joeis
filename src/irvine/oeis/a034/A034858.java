package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034858 a(n) = C(n+3,4) + 3*C(n+1,3) + 5*C(n-1,2) + 7*n - 15.
 * @author Sean A. Irvine
 */
public class A034858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034858() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {7, 38, 93, 180, 308});
  }
}
