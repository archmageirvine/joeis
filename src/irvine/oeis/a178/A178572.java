package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178572.
 * @author Sean A. Irvine
 */
public class A178572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178572() {
    super(new long[] {1, -3, 3}, new long[] {11, 47, 108});
  }
}
