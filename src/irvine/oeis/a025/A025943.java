package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025943 Expansion of 1/((1-2x)(1-3x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A025943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025943() {
    super(new long[] {-336, 370, -137, 20}, new long[] {1, 20, 263, 2890});
  }
}
