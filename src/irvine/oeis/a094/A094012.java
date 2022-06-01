package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094012 Expansion of x*(1-6*x+10*x^2)/(1-4*x+2*x^2)^2.
 * @author Sean A. Irvine
 */
public class A094012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094012() {
    super(new long[] {-4, 16, -20, 8}, new long[] {0, 1, 2, 6});
  }
}
