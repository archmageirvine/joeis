package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217730 Expansion of (1+2*x-x^3)/(1-4*x^2+2*x^4).
 * @author Sean A. Irvine
 */
public class A217730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217730() {
    super(new long[] {-2, 0, 4, 0}, new long[] {1, 2, 4, 7});
  }
}
