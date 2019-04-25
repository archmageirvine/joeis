package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228208 y-values in the solution to <code>x^2 - 20y^2 = 176</code>.
 * @author Sean A. Irvine
 */
public class A228208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228208() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 2, 5, 7});
  }
}
