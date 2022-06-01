package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193393 Wiener index of a benzenoid consisting of a zig-zag chain of n hexagons (s=13; see the Gutman et al. reference).
 * @author Sean A. Irvine
 */
public class A193393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193393() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 109, 271, 545});
  }
}
