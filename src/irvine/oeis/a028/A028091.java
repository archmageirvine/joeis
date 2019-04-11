package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028091 Expansion of <code>1/((1-3x)(1-7x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028091() {
    super(new long[] {-1848, 1279, -299, 29}, new long[] {1, 29, 542, 8326});
  }
}
