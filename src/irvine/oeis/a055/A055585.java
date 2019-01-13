package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055585.
 * @author Sean A. Irvine
 */
public class A055585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055585() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 6, 25, 88});
  }
}
