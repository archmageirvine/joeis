package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017377 a(n) = 10*n + 9.
 * @author Sean A. Irvine
 */
public class A017377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017377() {
    super(new long[] {-1, 2}, new long[] {9, 19});
  }
}
