package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080930 a(n) = 2^(n-3)*(n+2)*(n+3)*(n+4)/3.
 * @author Sean A. Irvine
 */
public class A080930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080930() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 5, 20, 70});
  }
}
