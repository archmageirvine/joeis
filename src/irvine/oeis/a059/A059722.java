package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059722 a(n) = n*(2*n^2 - 2*n + 1).
 * @author Sean A. Irvine
 */
public class A059722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059722() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 10, 39});
  }
}
