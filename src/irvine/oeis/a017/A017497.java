package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017497 a(n) = 11*n + 9.
 * @author Sean A. Irvine
 */
public class A017497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017497() {
    super(new long[] {-1, 2}, new long[] {9, 20});
  }
}
