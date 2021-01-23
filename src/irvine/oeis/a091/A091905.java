package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091905 Expansion of (1-4x)/((1+4x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A091905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091905() {
    super(new long[] {32, 4}, new long[] {1, 0});
  }
}
