package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128017 Expansion of (1+2x+x^2-x^3)/(1-x^2+x^4).
 * @author Sean A. Irvine
 */
public class A128017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128017() {
    super(new long[] {-1, 0, 1, 0}, new long[] {1, 2, 2, 1});
  }
}
