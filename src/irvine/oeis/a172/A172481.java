package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172481 a(n) = (3*n*2^n+2^(n+4)+2*(-1)^n)/18.
 * @author Sean A. Irvine
 */
public class A172481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172481() {
    super(new long[] {-4, 0, 3}, new long[] {1, 2, 5});
  }
}
