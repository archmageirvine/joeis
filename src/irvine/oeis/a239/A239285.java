package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239285 a(n) = (15^n - (-2)^n)/17.
 * @author Sean A. Irvine
 */
public class A239285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239285() {
    super(new long[] {30, 13}, new long[] {0, 1});
  }
}
