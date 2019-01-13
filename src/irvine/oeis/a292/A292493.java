package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292493.
 * @author Sean A. Irvine
 */
public class A292493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292493() {
    super(new long[] {1, 11, -2, 3}, new long[] {-1, 1, 12, 25});
  }
}
