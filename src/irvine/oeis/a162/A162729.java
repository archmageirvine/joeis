package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162729 a(n) = 5^n*(5^n-1)/2.
 * @author Sean A. Irvine
 */
public class A162729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162729() {
    super(new long[] {-125, 30}, new long[] {0, 10});
  }
}
