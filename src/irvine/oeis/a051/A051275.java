package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051275 Expansion of <code>(1+x^2)/((1-x^2)*(1-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A051275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051275() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 0, 2, 1, 2});
  }
}
