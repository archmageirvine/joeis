package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199744 G.f.: 1/(1 + x + 2*x^2 + 2*x^3 + x^4).
 * @author Sean A. Irvine
 */
public class A199744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199744() {
    super(new long[] {-1, -2, -2, -1}, new long[] {1, -1, -1, 1});
  }
}
