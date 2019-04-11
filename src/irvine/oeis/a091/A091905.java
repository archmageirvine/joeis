package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091905 Expansion of <code>(1-4x)/((1+4x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A091905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091905() {
    super(new long[] {32, 4}, new long[] {1, 0});
  }
}
