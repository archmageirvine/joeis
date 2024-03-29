package irvine.oeis.a327;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A327319 a(n) = binomial(n, 2) + 6*binomial(n, 4).
 * @author Georg Fischer
 */
public class A327319 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A327319() {
    super(0, "[0,-1, 5,-10, 10,-5, 1]", "[0, 0, 1, 3, 12]", 0);
  }
}
