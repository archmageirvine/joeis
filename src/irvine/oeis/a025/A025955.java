package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025955 Expansion of 1/((1-2x)(1-3x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A025955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025955() {
    super(new long[] {-660, 676, -221, 26}, new long[] {1, 26, 455, 6760});
  }
}
