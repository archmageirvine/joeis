package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016305 Expansion of 1/((1-2*x)*(1-6*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A016305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016305() {
    super(new long[] {96, -76, 16}, new long[] {1, 16, 180});
  }
}
