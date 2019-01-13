package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157374.
 * @author Sean A. Irvine
 */
public class A157374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157374() {
    super(new long[] {-1, 2}, new long[] {273, 616});
  }
}
