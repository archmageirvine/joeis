package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157257.
 * @author Sean A. Irvine
 */
public class A157257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157257() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {29, 41, 85, 89, 205, 481});
  }
}
