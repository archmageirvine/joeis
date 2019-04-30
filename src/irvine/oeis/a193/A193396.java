package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193396 Hyper-Wiener index of a benzenoid consisting of a double-step zig-zag chain of n hexagons <code>(n &gt;= 2</code>, s <code>= 2123</code>; see the Gutman et al. reference).
 * @author Sean A. Irvine
 */
public class A193396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193396() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {215, 636, 1557, 3162, 5875, 10008});
  }
}
