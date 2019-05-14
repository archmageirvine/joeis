package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116138 <code>a(n) = 3^n * n*(n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A116138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116138() {
    super(new long[] {27, -27, 9}, new long[] {0, 6, 54});
  }
}
