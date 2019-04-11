package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218155 Curvatures of tangents circle in circle of curvature <code>-1-1</code>.
 * @author Sean A. Irvine
 */
public class A218155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218155() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 3, 6, 11});
  }
}
