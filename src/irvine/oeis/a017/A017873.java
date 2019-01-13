package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017873.
 * @author Sean A. Irvine
 */
public class A017873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017873() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1});
  }
}
