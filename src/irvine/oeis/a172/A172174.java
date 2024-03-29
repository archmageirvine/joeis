package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172174 a(n) = 90*a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A172174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172174() {
    super(1, new long[] {-90, 91}, new long[] {1, 91});
  }
}
