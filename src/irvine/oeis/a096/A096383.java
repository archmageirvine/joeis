package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096383 Area of the Pythagorean triangle a <code>= u^2 - v^2 (cf. A096382)</code> when <code>u=3, v=4,4,5,..</code>.
 * @author Sean A. Irvine
 */
public class A096383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096383() {
    super(new long[] {-1, 4, -6, 4}, new long[] {84, 240, 486, 840});
  }
}
