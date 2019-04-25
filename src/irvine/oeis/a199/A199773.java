package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199773 y-values in the solution to <code>17*x^2 - 16 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A199773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199773() {
    super(new long[] {-1, 0, 0, 66, 0, 0}, new long[] {1, 16, 103, 169, 1072, 6799});
  }
}
