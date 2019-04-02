package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253150 Number of perfect matchings in the P_5 X C_{2n} graph.
 * @author Sean A. Irvine
 */
public class A253150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253150() {
    super(new long[] {1, -24, 192, -703, 1320, -1320, 703, -192, 24}, new long[] {450, 4480, 51842, 631750, 7840800, 97964230, 1227006722, 15382568320L, 192913661250L});
  }
}
