package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217733 Expansion of (1+x-x^2)/((1-x)*(1-3*x^2-x^3)).
 * @author Sean A. Irvine
 */
public class A217733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217733() {
    super(new long[] {-1, -2, 3, 1}, new long[] {1, 2, 4, 8});
  }
}
