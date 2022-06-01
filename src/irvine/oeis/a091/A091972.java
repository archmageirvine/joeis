package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091972 G.f.: (1 + x^5 ) / ( (1-x^3)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A091972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091972() {
    super(new long[] {-1, 1, -1, 2, -1, 1}, new long[] {1, 0, 0, 1, 1, 1});
  }
}
