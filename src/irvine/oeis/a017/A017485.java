package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017485 a(n) = 11*n + 8.
 * @author Sean A. Irvine
 */
public class A017485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017485() {
    super(new long[] {-1, 2}, new long[] {8, 19});
  }
}
