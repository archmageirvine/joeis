package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157739.
 * @author Sean A. Irvine
 */
public class A157739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157739() {
    super(new long[] {1, -3, 3}, new long[] {387199, 1552321, 3495367});
  }
}
