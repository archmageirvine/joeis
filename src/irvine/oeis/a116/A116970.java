package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116970 a(n) = (3^n - 7)/2.
 * @author Sean A. Irvine
 */
public class A116970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116970() {
    super(new long[] {-3, 4}, new long[] {1, 10});
  }
}
