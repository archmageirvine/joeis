package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157456.
 * @author Sean A. Irvine
 */
public class A157456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157456() {
    super(new long[] {-1, 16}, new long[] {1, 15});
  }
}
