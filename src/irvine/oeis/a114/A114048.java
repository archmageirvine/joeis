package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114048 x-values in the solution to <code>x^2 -</code> 19*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A114048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114048() {
    super(new long[] {-1, 340}, new long[] {1, 170});
  }
}
