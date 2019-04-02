package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137195 Even-indexed coefficients related to Kirchhoff index of hexagonal (benzene) chains.
 * @author Sean A. Irvine
 */
public class A137195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137195() {
    super(new long[] {-1, 0, 12, 0, -38, 0, 12, 0}, new long[] {1, 6, 19, 64, 185, 542, 1511, 4144});
  }
}
