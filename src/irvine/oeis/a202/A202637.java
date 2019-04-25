package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202637 x-values in the solution to <code>x^2 - 7*y^2 = -3</code>.
 * @author Sean A. Irvine
 */
public class A202637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202637() {
    super(new long[] {-1, 0, 16, 0}, new long[] {2, 5, 37, 82});
  }
}
