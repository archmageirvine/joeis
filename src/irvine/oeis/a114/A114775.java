package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114775 Expansion of x^2*(1+x^2)*(1 - x^4 + x^7)/((1 - x^4 + x^6)*(1 - x^4 - x^6)).
 * @author Sean A. Irvine
 */
public class A114775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114775() {
    super(new long[] {1, 0, 0, 0, -1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1});
  }
}
