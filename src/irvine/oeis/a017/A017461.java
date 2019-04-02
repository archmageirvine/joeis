package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017461 a(n) = 11*n+6.
 * @author Sean A. Irvine
 */
public class A017461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017461() {
    super(new long[] {-1, 2}, new long[] {6, 17});
  }
}
