package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157653.
 * @author Sean A. Irvine
 */
public class A157653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157653() {
    super(new long[] {1, -3, 3}, new long[] {45601, 246401, 607201});
  }
}
