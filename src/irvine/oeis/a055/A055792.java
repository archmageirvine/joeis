package irvine.oeis.a055;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055792 a(n) and floor(a(n)/2) are both squares; i.e., squares which remain squares when written in base 2 and last digit is removed.
 * @author Georg Fischer
 */
public class A055792 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055792() {
    super(0, "[[0],[-1],[35],[-35],[1]]", "[0, 1, 9, 289]", 0);
  }
}
