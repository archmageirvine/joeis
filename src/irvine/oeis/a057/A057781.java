package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057781 a(n) = n^4+4 = (n^2-2*n+2)*(n^2+2*n+2) = ((n-1)^2+1)*((n+1)^2+1).
 * @author Sean A. Irvine
 */
public class A057781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057781() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4, 5, 20, 85, 260});
  }
}
