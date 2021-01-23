package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025932 Expansion of 1/((1-2x)(1-3x)(1-5x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A025932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025932() {
    super(new long[] {-240, 278, -111, 18}, new long[] {1, 18, 213, 2114});
  }
}
