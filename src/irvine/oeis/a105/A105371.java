package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105371 Expansion of <code>(1-x)(1-x+x^2)/(1-3x+4x^2-2x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A105371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105371() {
    super(new long[] {-1, 2, -4, 3}, new long[] {1, 1, 1, 0});
  }
}
