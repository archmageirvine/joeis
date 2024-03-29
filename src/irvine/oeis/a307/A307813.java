package irvine.oeis.a307;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307813 a(n) = (5/32)*4^n - floor((n^2 + 1)/2)*2^(n - 2).
 * @author Georg Fischer
 */
public class A307813 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307813() {
    super(3, "[0, 64,-80, 16, 16,-8, 1]", "[0, 8, 56, 352, 1760]", 0);
  }
}
