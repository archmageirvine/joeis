package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193400 Hyper-Wiener index of a benzenoid consisting of a chain of n hexagons characterized by the encoding s = 1133 (see the Gutman et al. reference, Sec. 5).
 * @author Sean A. Irvine
 */
public class A193400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193400() {
    super(1, new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {42, 215, 636, 1513, 2862, 5211, 8352, 13229});
  }
}
