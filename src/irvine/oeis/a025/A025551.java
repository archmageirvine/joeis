package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025551 a(n) = 3^n*(3^n + 1)/2.
 * @author Sean A. Irvine
 */
public class A025551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025551() {
    super(new long[] {-27, 12}, new long[] {1, 6});
  }
}
