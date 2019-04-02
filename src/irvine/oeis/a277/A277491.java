package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277491 Number of triangles in the standard triangulation of the n-th approximation of the Koch snowflake fractal.
 * @author Sean A. Irvine
 */
public class A277491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277491() {
    super(new long[] {-36, 13}, new long[] {1, 12});
  }
}
