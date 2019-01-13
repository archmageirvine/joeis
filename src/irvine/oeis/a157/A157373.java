package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157373.
 * @author Sean A. Irvine
 */
public class A157373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157373() {
    super(new long[] {1, -3, 3}, new long[] {31, 158, 383});
  }
}
