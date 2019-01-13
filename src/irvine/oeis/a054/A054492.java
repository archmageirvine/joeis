package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054492.
 * @author Sean A. Irvine
 */
public class A054492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054492() {
    super(new long[] {-1, 3}, new long[] {1, 6});
  }
}
