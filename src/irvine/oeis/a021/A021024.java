package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021024 Expansion of 1/((1-x)(1-2x)(1-3x)(1-5x)).
 * @author Sean A. Irvine
 */
public class A021024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021024() {
    super(new long[] {-30, 61, -41, 11}, new long[] {1, 11, 80, 490});
  }
}
