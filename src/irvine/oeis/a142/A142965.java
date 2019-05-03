package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142965 One fourth of third column <code>(m=2)</code> of triangle <code>A142963</code>.
 * @author Sean A. Irvine
 */
public class A142965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142965() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {1, 18, 129, 646, 2685, 10002});
  }
}
