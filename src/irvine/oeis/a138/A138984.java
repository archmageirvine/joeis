package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138984 a(n) = Frobenius number for 4 successive numbers = F(n+1,n+2,n+3,n+4).
 * @author Sean A. Irvine
 */
public class A138984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138984() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 2, 3, 9, 11, 13, 23});
  }
}
