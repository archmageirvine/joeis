package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193395 Wiener index of a benzenoid consisting of a double-step zig-zag chain of n hexagons (n &gt;= 2, s = 2123; see the Gutman et al. reference).
 * @author Sean A. Irvine
 */
public class A193395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193395() {
    super(2, new long[] {-1, 3, -2, -2, 3}, new long[] {109, 271, 553, 971, 1573});
  }
}
