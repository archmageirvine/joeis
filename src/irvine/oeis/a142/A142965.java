package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142965 One fourth of third column (m=2) of triangle A142963.
 * @author Sean A. Irvine
 */
public class A142965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142965() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {1, 18, 129, 646, 2685, 10002});
  }
}
