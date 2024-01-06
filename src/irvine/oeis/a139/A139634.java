package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139634 a(n) = 10*2^(n-1) - 9.
 * @author Sean A. Irvine
 */
public class A139634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139634() {
    super(1, new long[] {-2, 3}, new long[] {1, 11});
  }
}
