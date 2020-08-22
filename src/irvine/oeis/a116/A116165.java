package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116165 a(n) = 7^n * n*(n+1).
 * @author Sean A. Irvine
 */
public class A116165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116165() {
    super(new long[] {343, -147, 21}, new long[] {0, 14, 294});
  }
}
