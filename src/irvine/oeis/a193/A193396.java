package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193396 Hyper-Wiener index of a benzenoid consisting of a <code>double-step zig-zag</code> chain of n hexagons <code>(n &gt;= 2, s = 2123</code>; see the Gutman et al. <code>reference)</code>.
 * @author Sean A. Irvine
 */
public class A193396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193396() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {215, 636, 1557, 3162, 5875, 10008});
  }
}
