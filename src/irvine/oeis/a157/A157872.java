package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157872.
 * @author Sean A. Irvine
 */
public class A157872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157872() {
    super(new long[] {1, -3, 3}, new long[] {6, 33, 78});
  }
}
