package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017402.
 * @author Sean A. Irvine
 */
public class A017402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017402() {
    super(new long[] {1, -3, 3}, new long[] {1, 144, 529});
  }
}
