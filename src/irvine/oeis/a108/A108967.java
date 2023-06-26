package irvine.oeis.a108;
// manually 2021-11-01

import irvine.oeis.NoncomputableSequence;

/**
 * A108967 This finite sequence is obtained by replacing the letters you are reading now with their rank in the alphabet.
 * @author Georg Fischer
 */
public class A108967 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A108967() {
    super(1, NONCOMPUTABLE, 20, 8, 9, 19, 6, 9, 14, 9, 20, 5, 19, 5, 17, 21, 5, 
        14, 3, 5, 9, 19, 15, 2, 20, 1, 9, 14, 5, 4, 2, 25, 18, 
        5, 16, 12, 1, 3, 9, 14, 7, 20, 8, 5, 12, 5, 20, 20, 5, 
        18, 19, 25, 15, 21, 1, 18, 5, 18, 5, 1, 4, 9, 14, 7, 14, 
        15, 23, 2, 25, 20, 8, 5, 9, 18, 18, 1, 14, 11, 9, 14, 20, 
        8, 5);
  }
}
