package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178945 Expansion of x*(1-x)^2/( (1-2*x^2)*(1-2*x)^2).
 * @author Sean A. Irvine
 */
public class A178945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178945() {
    super(new long[] {8, -8, -2, 4}, new long[] {1, 2, 7, 16});
  }
}
