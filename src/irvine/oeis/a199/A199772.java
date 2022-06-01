package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199772 x-values in the solution to 17*x^2 - 16 = y^2.
 * @author Sean A. Irvine
 */
public class A199772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199772() {
    super(new long[] {-1, 0, 0, 66, 0, 0}, new long[] {1, 4, 25, 41, 260, 1649});
  }
}
