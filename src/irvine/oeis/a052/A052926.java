package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052926 Expansion of <code>(1-3*x)/(1 - 4*x - x^2 + 3*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052926() {
    super(new long[] {-3, 1, 4}, new long[] {1, 1, 5});
  }
}
