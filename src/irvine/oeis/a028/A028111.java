package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028111 Expansion of 1/((1-4x)(1-5x)(1-6x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A028111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028111() {
    super(new long[] {-1080, 786, -209, 24}, new long[] {1, 24, 367, 4578});
  }
}
