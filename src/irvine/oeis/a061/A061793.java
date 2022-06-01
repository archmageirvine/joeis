package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061793 a(n) = 25*n*(n + 1)/2 + 3.
 * @author Sean A. Irvine
 */
public class A061793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061793() {
    super(new long[] {1, -3, 3}, new long[] {3, 28, 78});
  }
}
