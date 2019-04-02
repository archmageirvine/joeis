package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116668 a(n) = (5*n^2 + n + 2)/2.
 * @author Sean A. Irvine
 */
public class A116668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116668() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 12});
  }
}
