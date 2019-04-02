package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017569 a(n) = 12*n + 4.
 * @author Sean A. Irvine
 */
public class A017569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017569() {
    super(new long[] {-1, 2}, new long[] {4, 16});
  }
}
