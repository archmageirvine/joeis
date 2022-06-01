package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116138 a(n) = 3^n * n*(n + 1).
 * @author Sean A. Irvine
 */
public class A116138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116138() {
    super(new long[] {27, -27, 9}, new long[] {0, 6, 54});
  }
}
