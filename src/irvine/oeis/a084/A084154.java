package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084154 Binomial transform of sinh(x)*cosh(sqrt(2)*x).
 * @author Sean A. Irvine
 */
public class A084154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084154() {
    super(new long[] {4, -8, 0, 4}, new long[] {0, 1, 2, 10});
  }
}
