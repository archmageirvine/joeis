package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257602 Expansion of <code>(1+x+21*x^2+x^3+x^4)/(1-x)^5</code>.
 * @author Sean A. Irvine
 */
public class A257602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257602() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 41, 156, 426});
  }
}
