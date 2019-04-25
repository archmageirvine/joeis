package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174855 y-values in the solution to <code>x^2-51*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174855() {
    super(new long[] {-1, 100}, new long[] {0, 7});
  }
}
