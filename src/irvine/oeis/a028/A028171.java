package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028171 Expansion of <code>1/((1-5x)(1-6x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A028171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028171() {
    super(new long[] {-2400, 1420, -308, 29}, new long[] {1, 29, 533, 7945});
  }
}
