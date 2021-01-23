package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157363 686n - 14.
 * @author Sean A. Irvine
 */
public class A157363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157363() {
    super(new long[] {-1, 2}, new long[] {672, 1358});
  }
}
