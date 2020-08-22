package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111915 Expansion of -x^2*(x-1)*(x^2-x+1)*(x+x^2+1)/(1-x^4+x^8).
 * @author Sean A. Irvine
 */
public class A111915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111915() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0}, new long[] {0, 0, 1, -1, 1, -1, 2, -2});
  }
}
