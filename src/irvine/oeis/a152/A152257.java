package irvine.oeis.a152;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A152257 a(n) = (3^n - 1)^2*(3^n + 1)/16.
 * @author Georg Fischer
 */
public class A152257 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A152257() {
    super(0, "[[0],[729],[-1080],[390],[-40],[1]]", "[0, 1, 40, 1183, 32800]", 0);
  }
}
