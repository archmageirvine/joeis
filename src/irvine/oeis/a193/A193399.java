package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193399 Wiener index of a benzenoid consisting of a chain of n hexagons characterized by the encoding s = 1133 (see the Gutman et al. reference, Sec. 5).
 * @author Sean A. Irvine
 */
public class A193399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193399() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {27, 109, 271, 545, 931, 1493});
  }
}
