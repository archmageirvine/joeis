package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028122 Expansion of <code>1/((1-4x)(1-5x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028122() {
    super(new long[] {-1760, 1172, -279, 28}, new long[] {1, 28, 505, 7500});
  }
}
