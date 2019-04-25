package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174772 y-values in the solution to <code>x^2 - 33*y^2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A174772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174772() {
    super(new long[] {-1, 46}, new long[] {0, 4});
  }
}
