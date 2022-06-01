package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133931 Expansion of x*(2-4*x^2-x^3)/((1-x)^2*(1-x-x^2)).
 * @author Sean A. Irvine
 */
public class A133931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133931() {
    super(new long[] {1, -1, -2, 3}, new long[] {2, 6, 10, 15});
  }
}
