package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134169 a(n) = 2^(n-1)*(2^n - 1) + 1.
 * @author Sean A. Irvine
 */
public class A134169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134169() {
    super(new long[] {8, -14, 7}, new long[] {1, 2, 7});
  }
}
