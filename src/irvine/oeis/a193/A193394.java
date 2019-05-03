package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193394 Hyper-Wiener index of a benzenoid consisting of a zig-zag chain of n hexagons <code>(s=13</code>; see the Gutman et al. reference).
 * @author Sean A. Irvine
 */
public class A193394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193394() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 215, 636, 1513, 3118});
  }
}
