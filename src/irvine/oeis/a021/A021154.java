package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021154 Expansion of 1/((1-x)(1-2x)(1-5x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021154() {
    super(new long[] {-110, 197, -105, 19}, new long[] {1, 19, 256, 3066});
  }
}
