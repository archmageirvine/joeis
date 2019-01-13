package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092364.
 * @author Sean A. Irvine
 */
public class A092364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092364() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 27, 96, 250});
  }
}
