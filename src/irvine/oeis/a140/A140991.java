package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140991 a(n) = (1/9)*(7*2^n + (-1)^n*(3*n+2)) - (n-1)^2.
 * @author Sean A. Irvine
 */
public class A140991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140991() {
    super(new long[] {-2, 3, 3, -6, 0, 3}, new long[] {0, 1, 3, 1, 5, 7});
  }
}
