package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016887 a(n) = (5*n+3)^3.
 * @author Sean A. Irvine
 */
public class A016887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016887() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 512, 2197, 5832});
  }
}
