package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157010.
 * @author Sean A. Irvine
 */
public class A157010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157010() {
    super(new long[] {1, -3, 3}, new long[] {1010, 5297, 12946});
  }
}
