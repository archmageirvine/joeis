package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054488 Expansion of (1+2*x)/(1-6*x+x^2).
 * @author Sean A. Irvine
 */
public class A054488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054488() {
    super(new long[] {-1, 6}, new long[] {1, 8});
  }
}
