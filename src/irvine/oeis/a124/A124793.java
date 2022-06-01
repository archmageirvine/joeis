package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124793 Numbers in a perpendicular plane intersecting a 3D clockwise spiral produced by powers of 2.
 * @author Sean A. Irvine
 */
public class A124793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124793() {
    super(new long[] {32, 32, -1}, new long[] {1, 5, 35});
  }
}
