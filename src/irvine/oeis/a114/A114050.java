package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114050 x-values in the solution to <code>x^2 -</code> 22*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A114050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114050() {
    super(new long[] {-1, 394}, new long[] {1, 197});
  }
}
