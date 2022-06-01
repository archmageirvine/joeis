package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021484 Expansion of 1/((1-x)(1-3x)(1-5x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021484() {
    super(new long[] {-180, 291, -131, 21}, new long[] {1, 21, 310, 4050});
  }
}
