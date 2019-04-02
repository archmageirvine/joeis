package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021414 Expansion of 1/((1-x)(1-3x)(1-5x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A021414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021414() {
    super(new long[] {-90, 153, -77, 15}, new long[] {1, 15, 148, 1218});
  }
}
