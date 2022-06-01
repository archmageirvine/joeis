package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084060 a(n) = 1/2 + (1-6*n)*(-1)^n/2.
 * @author Sean A. Irvine
 */
public class A084060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084060() {
    super(new long[] {1, 1, -1}, new long[] {1, 3, -5});
  }
}
