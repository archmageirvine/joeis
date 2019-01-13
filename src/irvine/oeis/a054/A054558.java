package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054558.
 * @author Sean A. Irvine
 */
public class A054558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054558() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {150, 960, 3605, 10360, 25200, 54600, 108570, 201960});
  }
}
