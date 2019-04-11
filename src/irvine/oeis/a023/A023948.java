package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023948 Expansion of <code>1/((1-x)(1-5x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A023948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023948() {
    super(new long[] {-660, 907, -275, 29}, new long[] {1, 29, 566, 9346});
  }
}
