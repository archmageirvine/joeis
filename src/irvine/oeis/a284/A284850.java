package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284850 a(n) = 4^n - 3^n - n.
 * @author Sean A. Irvine
 */
public class A284850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284850() {
    super(1, new long[] {-12, 31, -27, 9}, new long[] {0, 5, 34, 171});
  }
}
