package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228210 x-values in the solutions to <code>x^2 - 5y^2 = 44</code>.
 * @author Sean A. Irvine
 */
public class A228210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228210() {
    super(new long[] {-1, 0, 3, 0}, new long[] {7, 8, 13, 17});
  }
}
