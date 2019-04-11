package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021514 Expansion of <code>1/((1-x)(1-3x)(1-6x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A021514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021514() {
    super(new long[] {-180, 288, -127, 20}, new long[] {1, 20, 273, 3208});
  }
}
