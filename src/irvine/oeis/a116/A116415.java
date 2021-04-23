package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116415 a(n) = 5*a(n-1) - 3*a(n-2).
 * @author Sean A. Irvine
 */
public class A116415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116415() {
    super(new long[] {-3, 5}, new long[] {1, 5});
  }
}
