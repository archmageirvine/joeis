package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212331 a(n) = 5*n*(n+5)/2.
 * @author Sean A. Irvine
 */
public class A212331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212331() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 35});
  }
}
