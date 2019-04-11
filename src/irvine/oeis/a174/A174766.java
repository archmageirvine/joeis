package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174766 y-values in the solution to <code> x^2 -</code> 22*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A174766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174766() {
    super(new long[] {-1, 394}, new long[] {0, 42});
  }
}
