package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028190 Expansion of 1/((1-5x)(1-8x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028190() {
    super(new long[] {-3600, 1930, -377, 32}, new long[] {1, 32, 647, 10570});
  }
}
