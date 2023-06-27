package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020868 Number of single component edge-subgraphs in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020868() {
    super(2, new long[] {4, -32, 121, -275, 405, -391, 239, -85, 15}, new long[] {60, 397, 2464, 14809, 87000, 502261, 2859968, 16105801, 89879304});
  }
}
