package irvine.oeis.a299;
// Generated by gen_seq4.pl holos [[0],[-15,41,-34,8],[225,-630,540,-144],[0,21,-26,8]] [1,3,43] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A299506 a(n) = hypergeom([-n, n - 1/2], [1], -4).
 * @author Georg Fischer
 */
public class A299506 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A299506() {
    super(0, "[[0],[-15,41,-34,8],[225,-630,540,-144],[0,21,-26,8]]", "[1,3,43]", 0);
  }
}
