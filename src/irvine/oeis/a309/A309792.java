package irvine.oeis.a309;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309792 Expansion of (2 + 6*x + 3*x^2 +4*x^3 - 10*x^4)/(1 - x - 4*x^4 + 4*x^5).
 * @author Georg Fischer
 */
public class A309792 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309792() {
    super(0, "[0, 4,-4, 0, 0,-1, 1]", "[2, 8, 5, 9, 7]", 0);
  }
}
