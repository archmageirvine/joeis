package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028167 Expansion of 1/((1-5x)(1-6x)(1-7x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028167() {
    super(new long[] {-2100, 1280, -287, 28}, new long[] {1, 28, 497, 7160});
  }
}
