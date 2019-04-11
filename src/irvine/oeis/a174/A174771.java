package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174771 y-values in the solution to <code>x^2 -</code> 31*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A174771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174771() {
    super(new long[] {-1, 3040}, new long[] {0, 273});
  }
}
