package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175015 y-values in the solution to <code>x^2-57*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A175015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175015() {
    super(new long[] {-1, 302}, new long[] {0, 20});
  }
}
