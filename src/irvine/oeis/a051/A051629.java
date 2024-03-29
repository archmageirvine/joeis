package irvine.oeis.a051;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051629 Poincar\u00e9 series [or Poincare series] for Gamma_2(1,2).
 * @author Georg Fischer
 */
public class A051629 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051629() {
    super(0, "[0, 1,-1, 0, 0,-1, 1,-1, 1, 0, 0, 1,-1,-1, 1, 0, 0, 1,-1, 1,-1, 0, 0,-1, 1]", "[1, 0, 0, 0, 2, 0, 2, 0, 4, 0, 5, 0, 9, 0, 9, 0, 15, 0, 17, 1, 23, 1, 27, 3, 36, 3, 39]", 0);
  }
}
