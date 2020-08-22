package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199802 G.f.:  1/(1-2*x+2*x^2-x^3+x^4).
 * @author Sean A. Irvine
 */
public class A199802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199802() {
    super(new long[] {-1, 1, -2, 2}, new long[] {1, 2, 2, 1});
  }
}
