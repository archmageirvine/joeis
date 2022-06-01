package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028212 Expansion of 1/((1-6x)(1-8x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028212() {
    super(new long[] {-5184, 2520, -450, 35}, new long[] {1, 35, 775, 13895});
  }
}
