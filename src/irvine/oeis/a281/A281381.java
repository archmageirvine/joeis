package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281381 a(n) = n*(n + 1)*(4*n + 5)/2.
 * @author Sean A. Irvine
 */
public class A281381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281381() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 9, 39, 102});
  }
}
