package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016268 Expansion of 1/((1-x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016268() {
    super(new long[] {132, -155, 24}, new long[] {1, 24, 421});
  }
}
