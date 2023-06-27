package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095263 a(n+3) = 3*a(n+2) - 2*a(n+1) + a(n).
 * @author Sean A. Irvine
 */
public class A095263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095263() {
    super(1, new long[] {1, -2, 3}, new long[] {1, 3, 7});
  }
}
