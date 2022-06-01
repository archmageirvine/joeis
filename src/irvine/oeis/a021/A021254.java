package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021254 Expansion of 1/((1-x)(1-2x)(1-7x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021254() {
    super(new long[] {-168, 290, -143, 22}, new long[] {1, 22, 341, 4646});
  }
}
