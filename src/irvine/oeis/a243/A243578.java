package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243578.
 * @author Sean A. Irvine
 */
public class A243578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243578() {
    super(new long[] {1, -3, 3}, new long[] {39, 191, 471});
  }
}
