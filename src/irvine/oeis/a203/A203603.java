package irvine.oeis.a203;

import irvine.oeis.FiniteSequence;

/**
 * A203603 Numbers n=a+b+c+d such that 0&lt;a&lt;b&lt;c&lt;d and concatenation(n,a,b,c,d) is a permutation of the digits 0,...,9.
 * @author Georg Fischer
 */
public class A203603 extends FiniteSequence {

  /** Construct the sequence. */
  public A203603() {
    super(1, FINITE, 153, 162, 180, 189, 207, 216, 234, 243, 270, 306, 315, 351, 360, 405, 450, 459, 468, 513, 531, 576, 603, 612, 621, 630, 702, 720, 729, 738, 801, 810, 819, 846);
  }
}
