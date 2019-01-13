package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017174.
 * @author Sean A. Irvine
 */
public class A017174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017174() {
    super(new long[] {1, -3, 3}, new long[] {1, 100, 361});
  }
}
