package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243079 Numbers n such that A = n - DigitProd(n) is divisible by the largest power of 10 &lt;= A.
 * @author Georg Fischer
 */
public class A243079 extends FiniteSequence {

  /** Construct the sequence. */
  public A243079() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 35, 55, 62, 64, 66, 68, 75, 95, 236, 315, 324, 575, 612, 828, 935, 944, 4384, 5175, 7688, 7735, 8128, 8672, 9135, 9144, 9575, 91575);
  }
}
