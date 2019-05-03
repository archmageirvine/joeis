package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193395 Wiener index of a benzenoid consisting of a <code>double-step zig-zag</code> chain of n hexagons <code>(n &gt;= 2, s = 2123</code>; see the Gutman et al. <code>reference)</code>.
 * @author Sean A. Irvine
 */
public class A193395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193395() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {109, 271, 553, 971, 1573});
  }
}
