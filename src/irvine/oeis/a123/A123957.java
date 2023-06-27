package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123957 Expansion of g.f.: x^4/((1+2*x) * (1-2*x+x^2+2*x^3)).
 * @author Sean A. Irvine
 */
public class A123957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123957() {
    super(1, new long[] {-4, -4, 3, 0}, new long[] {0, 0, 0, 1});
  }
}
