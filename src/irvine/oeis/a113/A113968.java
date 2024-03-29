package irvine.oeis.a113;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A113968 a(0) = 0 and a(n) = (5*(-4)^n + 16*(-1)^n + 9*4^n)/240 for n &gt;= 1.
 * @author Georg Fischer
 */
public class A113968 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A113968() {
    super(0, "[0,-16,-16, 1, 1]", "[0, 0, 1, 1]", 0);
  }
}
