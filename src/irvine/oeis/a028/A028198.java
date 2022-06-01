package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028198 Expansion of 1/((1-5x)(1-9x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028198() {
    super(new long[] {-5940, 2883, -499, 37}, new long[] {1, 37, 870, 16610});
  }
}
