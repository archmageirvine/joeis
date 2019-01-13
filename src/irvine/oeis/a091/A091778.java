package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091778.
 * @author Sean A. Irvine
 */
public class A091778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091778() {
    super(new long[] {1, -3, 3, -3, 6, -7, 6, -7, 9, -10, 9, -9, 10, -9, 7, -6, 7, -6, 3, -3, 3}, new long[] {1, 2, 4, 8, 14, 24, 40, 63, 96, 144, 210, 300, 422, 582, 791, 1062, 1406, 1840, 2384, 3056, 3882});
  }
}
