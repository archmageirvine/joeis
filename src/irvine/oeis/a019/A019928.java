package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019928 Expansion of 1/((1-5x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A019928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019928() {
    super(new long[] {280, -131, 20}, new long[] {1, 20, 269});
  }
}
