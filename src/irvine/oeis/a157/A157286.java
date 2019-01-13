package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157286.
 * @author Sean A. Irvine
 */
public class A157286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157286() {
    super(new long[] {1, -3, 3}, new long[] {35, 142, 321});
  }
}
