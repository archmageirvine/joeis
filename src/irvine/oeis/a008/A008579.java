package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008579 Coordination sequence for planar net 3.6.3.6. Spherical growth function for a certain reflection group in plane.
 * @author Sean A. Irvine
 */
public class A008579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008579() {
    super(new long[] {0, 0, -1, 0, 2, 0}, new long[] {1, 4, 8, 14, 18, 22});
  }
}

