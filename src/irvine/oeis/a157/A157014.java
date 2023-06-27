package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157014 Expansion of x*(1-x)/(1 - 22*x + x^2).
 * @author Sean A. Irvine
 */
public class A157014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157014() {
    super(1, new long[] {-1, 22}, new long[] {1, 21});
  }
}
