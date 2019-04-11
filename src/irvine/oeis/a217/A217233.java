package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217233 Expansion of <code>(1-2*x+x^2)/(1-3*x-3*x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A217233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217233() {
    super(new long[] {-1, 3, 3}, new long[] {1, 1, 7});
  }
}
