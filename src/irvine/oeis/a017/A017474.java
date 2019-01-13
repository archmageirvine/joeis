package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017474.
 * @author Sean A. Irvine
 */
public class A017474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017474() {
    super(new long[] {1, -3, 3}, new long[] {49, 324, 841});
  }
}
