package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193399 Wiener index of a benzenoid consisting of a chain of n hexagons characterized by the encoding s <code>= 1133 (see</code> the Gutman et al. reference, Sec. <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A193399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193399() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {27, 109, 271, 545, 931, 1493});
  }
}
