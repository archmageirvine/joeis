package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174763 x-values in the solution to <code>x^2-62*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174763() {
    super(new long[] {-1, 126}, new long[] {1, 63});
  }
}
