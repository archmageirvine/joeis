package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181762 a(n) = n/2 if n is even, otherwise 3n+5.
 * @author Sean A. Irvine
 */
public class A181762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181762() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 8, 1, 14});
  }
}
