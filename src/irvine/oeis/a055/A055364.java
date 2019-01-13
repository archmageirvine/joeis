package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055364.
 * @author Sean A. Irvine
 */
public class A055364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055364() {
    super(new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 4, 10, 22, 42, 73, 119, 184});
  }
}
