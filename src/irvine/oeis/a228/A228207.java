package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228207 x-values in the solution to <code>x^2 -</code> 20y^2 <code>= 176</code>.
 * @author Sean A. Irvine
 */
public class A228207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228207() {
    super(new long[] {-1, 0, 3, 0}, new long[] {14, 16, 26, 34});
  }
}
