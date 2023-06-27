package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192792 Molecular topological indices of the Apollonian graphs.
 * @author Sean A. Irvine
 */
public class A192792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192792() {
    super(1, new long[] {23328, -49896, 43920, -26346, 9182, 2537, -4109, 1676, -320, 29}, new long[] {72, 360, 2556, 22572, 219636, 2204244, 22197420, 222257988, 2207645892L, 21754722852L});
  }
}
