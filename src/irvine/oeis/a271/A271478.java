package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271478 If n is even, a(n)=n/2, otherwise 2*n+2.
 * @author Sean A. Irvine
 */
public class A271478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271478() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 4, 1, 8});
  }
}
