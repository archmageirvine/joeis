package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134538 a(n) = 5*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A134538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134538() {
    super(1, new long[] {1, -3, 3}, new long[] {4, 19, 44});
  }
}
