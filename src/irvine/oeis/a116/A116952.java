package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116952 a(n) = 3*a(n-1) + 5 with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A116952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116952() {
    super(new long[] {-3, 4}, new long[] {1, 8});
  }
}
