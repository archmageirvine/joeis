package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217778 Expansion of (1-x)^2*(1-3*x)/((1-3*x+x^2)*(1-5*x+5*x^2)).
 * @author Sean A. Irvine
 */
public class A217778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217778() {
    super(new long[] {-5, 20, -21, 8}, new long[] {1, 3, 10, 34});
  }
}
