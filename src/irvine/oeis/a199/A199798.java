package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199798 y-values in the solution to <code>17*x^2 + 16 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A199798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199798() {
    super(new long[] {-1, 0, 0, 66, 0, 0}, new long[] {4, 13, 21, 132, 837, 1373});
  }
}
