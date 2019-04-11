package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028181 Expansion of <code>1/((1-5x)(1-7x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A028181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028181() {
    super(new long[] {-2800, 1590, -331, 30}, new long[] {1, 30, 569, 8730});
  }
}
