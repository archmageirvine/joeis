package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021094 Expansion of <code>1/((1-x)(1-2x)(1-4x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021094() {
    super(new long[] {-88, 162, -91, 18}, new long[] {1, 18, 233, 2718});
  }
}
