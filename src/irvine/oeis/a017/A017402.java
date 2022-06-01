package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017402 (11n+1)^2.
 * @author Sean A. Irvine
 */
public class A017402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017402() {
    super(new long[] {1, -3, 3}, new long[] {1, 144, 529});
  }
}
