package irvine.oeis.a323;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A323218 a(n) = (4*n^3 + 30*n^2 + 50*n)/3 + 1.
 * @author Georg Fischer
 */
public class A323218 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A323218() {
    super(0, "[[0],[-3,-50,-30,-4],[-21, 2, 18, 4]]", "[1, 29]", 0);
  }
}
