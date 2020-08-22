package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017425 a(n) = 11*n + 3.
 * @author Sean A. Irvine
 */
public class A017425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017425() {
    super(new long[] {-1, 2}, new long[] {3, 14});
  }
}
