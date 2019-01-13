package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288476.
 * @author Sean A. Irvine
 */
public class A288476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288476() {
    super(new long[] {-2, 4, 1}, new long[] {2, 4, 8});
  }
}
