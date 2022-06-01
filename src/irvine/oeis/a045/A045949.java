package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045949 Number of equilateral triangles formed out of matches that can be found in a hexagonal chunk of side length n in hexagonal array of matchsticks.
 * @author Sean A. Irvine
 */
public class A045949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045949() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 6, 38, 116, 262});
  }
}
