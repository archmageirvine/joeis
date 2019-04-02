package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053794 a(n) = (n^2 + n) modulo 8.
 * @author Sean A. Irvine
 */
public class A053794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053794() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1}, new long[] {0, 2, 6, 4, 4, 6, 2});
  }
}
