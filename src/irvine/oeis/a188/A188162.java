package irvine.oeis.a188;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A188162 a(n) = ceiling( 4^n/20 - (n^2 + 1)*2^(n-1) ).
 * @author Georg Fischer
 */
public class A188162 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A188162() {
    super(0, "[0,-32, 56,-4,-46, 35,-10, 1]", "[0,-1,-9,-36,-123,-364,-979]", 0);
  }
}
