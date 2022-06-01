package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021284 Expansion of 1/((1-x)(1-2x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021284() {
    super(new long[] {-180, 308, -149, 22}, new long[] {1, 22, 335, 4400});
  }
}
