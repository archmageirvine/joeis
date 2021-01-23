package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078789 Expansion of (1-4*x+2*x^2)/(1-7*x+13*x^2-4*x^3).
 * @author Sean A. Irvine
 */
public class A078789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078789() {
    super(new long[] {4, -13, 7}, new long[] {1, 3, 10});
  }
}
