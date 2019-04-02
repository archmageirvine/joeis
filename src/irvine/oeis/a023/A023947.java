package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023947 Expansion of 1/((1-x)(1-5x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A023947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023947() {
    super(new long[] {-600, 830, -257, 28}, new long[] {1, 28, 527, 8390});
  }
}
