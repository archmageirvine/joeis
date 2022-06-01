package irvine.oeis.a170;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A170955 a(n) = 10^n - 9.
 * @author Sean A. Irvine
 */
public class A170955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170955() {
    super(new long[] {-10, 11}, new long[] {1, 91});
  }
}
