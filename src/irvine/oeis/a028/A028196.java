package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028196 Expansion of <code>1/((1-5x)(1-9x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028196() {
    super(new long[] {-4950, 2485, -449, 35}, new long[] {1, 35, 776, 13930});
  }
}
