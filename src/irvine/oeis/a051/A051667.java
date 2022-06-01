package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051667 a(n) = 6*2^n - 4*n - 6.
 * @author Sean A. Irvine
 */
public class A051667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051667() {
    super(new long[] {2, -5, 4}, new long[] {0, 2, 10});
  }
}
