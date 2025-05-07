package irvine.oeis.a381;

import irvine.oeis.FiniteSequence;

/**
 * A381103 Number of permissible general positions in three-dimensional space groups obeying the crystallographic restriction theorem.
 * @author Sean A. Irvine
 */
public class A381103 extends FiniteSequence {

  /** Construct the sequence */
  public A381103() {
    super(1, FINITE, 1, 2, 3, 4, 6, 8, 9, 12, 16, 18, 24, 32, 36, 48, 96, 192);
  }
}
